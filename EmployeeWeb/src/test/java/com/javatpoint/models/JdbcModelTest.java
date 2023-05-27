package com.javatpoint.models;

import com.javatpoint.models.Emp;
import com.javatpoint.models.JdbcModel;
import java.sql.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.extensions.TestSetup;

public class JdbcModelTest extends TestCase {
// Ceci evite de creer l'instance dans chaque methode de tests et simplifie donc l ecriture des cas de tests.

   private JdbcModel jdbcmdl;

   public JdbcModelTest() {
	    super();
   }
// protected void setUp() ?
   public void setUp() throws Exception {
             super.setUp();
             jdbcmdl= new JdbcModel("localhost" , "eltechdb", "root", "lpf6lmsql") ;
  }

   public void tearDown() throws Exception {
	    super.tearDown();
            jdbcmdl = null;
   } 

   public void testJdbcModel() {
            assertNotNull("L instance n'est pas creee", jdbcmdl);
   }

   public void testGetPort() {
            assertEquals("Le port est incorrect", 3306, jdbcmdl.getPort());
   }

 // problem here: connect returns void
   public void testConnect() {
           // assertNotNull("La connection est echouee", jdbcmdl.connect());
        try {
	   jdbcmdl.connect();
        }
	catch (SQLException e) {
           System.out.println("La connection est echouee");
	   e.printStackTrace();
	}
    }

   public static Test suite() {
	  // pattern decorateur Pour des besoins particuliers, il peut etre necessaire d executer du code une seule fois avant l execution des cas de tests et/ou d executer du code une fois tous les cas de tests executes.
    TestSetup setup = new TestSetup(new TestSuite(JdbcModelTest.class)) {
           protected void setUp() throws Exception {
		   // code execute une seule fois avant l execution des cas de tests
		  System.out.println("Appel de la methode setUp() de la classe de tests");
	   }

           protected void tearDown() throws Exception {
        // code execute une seule fois apres l execution des cas de tests
                  System.out.println("Appel de la methode tearDown() de la classe de tests");
           }   
    };
    return setup;
  }
  
  public static void main(String[] args) {
      junit.textui.TestRunner.run(suite());
  }

}

