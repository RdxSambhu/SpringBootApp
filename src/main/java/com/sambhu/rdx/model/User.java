package com.sambhu.rdx.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	private String userid;
	
	private String userpassword;
	private String username;
	private String useremail;
	private String usergender;
	private String usermobileno;
	private String userrole;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUsergender() {
		return usergender;
	}
	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}

	public String getUsermobileno() {
		return usermobileno;
	}
	public void setUsermobileno(String usermobileno) {
		this.usermobileno = usermobileno;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", userpassword=" + userpassword + ", username=" + username + ", useremail="
				+ useremail + ", usergender=" + usergender + ", usermobileno=" + usermobileno + ", userrole=" + userrole
				+ "]";
	}

}
