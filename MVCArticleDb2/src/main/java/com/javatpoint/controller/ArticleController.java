package com.javatpoint.controller;

import com.javatpoint.model.*;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;

@Controller
public class ArticleController {
   
// fred: un simple formulaire avec un param en clair (GET) pour commencer
   @RequestMapping(value="/article", method=RequestMethod.GET)
   public String queryarticle(Model md, HttpServletRequest request, HttpSession session) {
     try {
        String stitle = request.getParameter("title");
        String spubdate = request.getParameter("pubdate");
	
	//Article newArticle = new Article(stitle, spubdate);
        Article newArticle = new Article(stitle);
        md.addAttribute("article", newArticle);
        return "redirect:/myprofile"; // a landing page
     } catch (Exception e) {
        System.out.println("Error in request /article");
        e.printStackTrace();
        return "article"; // same page
     }
   }
}

