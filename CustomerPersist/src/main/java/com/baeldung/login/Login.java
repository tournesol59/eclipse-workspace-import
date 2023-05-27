package com.baeldung.login;
import org.springframework.stereotype.Component;
//
//@Component
public class Login {
        private int loginId;
	private String name;

	public Login(int id, String name) {
	     super();
             this.loginId = id;
             this.name = name;
	}

	public int getId() {
             return this.loginId;
	}
	
	public void setId(int id) {
             this.loginId = id;
	}

	public String getName() {
             return this.name;
	}

	public void setName(String sname) {
             this.name = sname;
	}
}
