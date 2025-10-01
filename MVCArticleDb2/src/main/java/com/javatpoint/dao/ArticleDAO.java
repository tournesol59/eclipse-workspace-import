package com.javatpoint.dao;

import com.javatpoint.model.*;
import com.javatpoint.base.*;

import java.sql.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class ArticleDAO {
// no interface
   private IDatabase connectService;
   
   protected Connection connect;
   
	@Autowired
	public void setConnectService(IDatabase connectService) {
		this.connectService = connectService;
	}
	
	public void initDatabase() {
		try {
			Statement stmt = connect.createStatement();
			stmt.execute("CREATE TABLE tblarticle (id INT PRIMARY KEY, title VARCHAR(100), pubdate DATE);");
			stmt.close();
		} catch (Exception e) {
			System.out.println("Article DAO initialize error");
		}
		try {
			PreparedStatement pstmt = connect.prepareStatement("INSERT INTO tblarticle VALUES (1, \"Lord of the Rings T1: fellowship of the ring\", \"1954.10.01\");");
			pstmt.execute();
			pstmt.close();
		} catch (Exception e) {
			System.out.println("Article DAO initialize error");
		}
	}
	
   public ArticleDAO() {
	   try {
		   this.connect = this.connectService.getConnection();
		   //initDatabase(); // fred: call it from main program or controller
	   } catch (Exception e) {
		   System.out.println("ArticleDAO cannot get connection");
	   }
   }
   
   public Article findById(int id) {
       ResultSet result;
       Article anArticle=null;
       try {
            PreparedStatement pstmt = connect.prepareStatement("SELECT id, title, pubdate FROM tblarticle WHERE id=?;");
	    pstmt.setInt(1, id);
	    result = pstmt.executeQuery();
	    if (result.next()) {
                  anArticle = new Article(result.getInt(1), 
				  result.getString(1),
				  "1901.01.01");
                  anArticle.setSqlPubDate(result.getDate(1));
		  return anArticle;
	    }
	    else 
		  return null;
       } catch (Exception e) {
	    System.out.println("Article DAO error in query findById");
	    return null;
       }
    // by pass for moment:
       // return new Article(1, "Lord of the Rings T1: fellowship of the ring", "1954.10.01");
   }

   public void update(Article anArticle) {
      /* // search id by title
      
      ResultSet result;
      try {
          PreparedStatement pstmt = connect.prepareStatement("SELECT id, title FROM tblarticle WHERE title=?;");
	  pstmt.setString(1, anArticle.getTitle());
	  result = pstmt.executeQuery();
	  if (result.next()) {
             anArticle.setId(result.getInt(1));
	  }
	  else {
             System.out.println("ArticleDAO cannot update non existing article by title");
	  }
      } catch (SQLException e) {
          System.out.println("ArticleDAO error in update part 1");
      }
      */
      // now update part
      try {
	  PreparedStatement pstmt = connect.prepareStatement("UPDATE tblarticle SET title=? WHERE id=?;");
	  pstmt.setString(1, anArticle.getTitle());
	 // pstmt.setDate(1, anArticle.getPubDate());
	  pstmt.setInt(1, anArticle.getId());
	  int rowupd = pstmt.executeUpdate();
	  if (rowupd == 0) {
              System.out.println("ArticleDAO update: now rows to be updated");
	  }
      } catch (SQLException e) {
	  System.out.println("ArticleDAO error in update part 2");
      }
      // by pass
      //System.out.println(anArticle.getTitle()+", "+anArticle.formatPubDate());
   }
}

