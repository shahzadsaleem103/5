package com.spring.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "USER_TBL")
public class User {

		 @Id
		 @GeneratedValue(strategy = GenerationType.AUTO)	
		 private int uid;
	 
		private String uname;
		private String upassword;
		private String uemail;
		private String utype;
		
		public User() {}


		public User(int uid, String uname, String upassword, String uemail, String utype) 
		{
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
		this.uemail = uemail;
		this.utype = utype;
		}




public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpassword() {
	return upassword;
}
public void setUpassword(String upassword) {
	this.upassword = upassword;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public String getUtype() {
	return utype;
}
public void setUtype(String utype) {
	this.utype = utype;
}
}
