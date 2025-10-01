package com.javatpoint.model;

import java.sql.Timestamp.*;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Article {

  private int id;	
  // after first test, add other properties: owner, date
  private String title;
  private Date pubdate;

  public Article(String stitle) {
    super();
    this.title = stitle;
    //this.pubdate = pubdate;
  }

  public Article(int id, String stitle, String spubdate) {
    super();
    this.id = id;
    this.title = stitle;
    // fred: tricky operation to manipulate String but store Date formats
    DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    LocalDate locpubdate = LocalDate.from(europeanDateFormatter.parse(spubdate));
    this.pubdate = java.sql.Date.valueOf(locpubdate);
  }

  public int getId() {
    return this.id; 
  }

  public void setId(int id) {
    this.id=id;
  }

  public String getTitle() {
    return this.title; 
  }

  public void setTitle(String stitle) {
    this.title = stitle;
  }

  public Date getPubDate() {
    return this.pubdate;
  }

  public String formatPubDate() {
    DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");	  
    LocalDate locpubdate = new java.sql.Date(this.pubdate.getTime()).toLocalDate();
    return europeanDateFormatter.format(locpubdate);
  }

  public void setPubDate(LocalDate locpubdate) {
     this.pubdate = java.sql.Date.valueOf(locpubdate);
  }

  public void setSqlPubDate(Date pubdate) {
     this.pubdate = pubdate;
  }

  public void parsePubDate(String spubdate) {
// same method as in constructor
    DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    LocalDate locpubdate = LocalDate.from(europeanDateFormatter.parse(spubdate));
    this.pubdate = java.sql.Date.valueOf(locpubdate);
    // fred: note that the reverse conversion, Date to LocalDate would imply:
    // locpubdate = this.pubdate.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
  }

}

