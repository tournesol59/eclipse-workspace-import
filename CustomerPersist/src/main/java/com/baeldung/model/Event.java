package com.baeldung.model;

import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Event {

   private int eventId;
   private String date;
   private String title;

   public Event(int id, String date, String title) {
           super();
	   this.eventId = id;
	   this.date = date;
	   this.title = title;
   }

   public int getEventId() {
	   return eventId;
   }

   public void setEventId(int id) {
	   this.eventId = id;
   }

   public String getDate() {
           return date;
   }

   public void setDate(String date) {
	   this.date = date;
   }

   public String getTitle() {
           return title;
   }

   public void setTitle(String title) {
	   this.title = title;
   }

}
