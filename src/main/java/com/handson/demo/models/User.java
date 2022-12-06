package com.handson.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usertable")
public class User {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int USERID;
    private String USERNAME;
    private String USERPASSWORD;
    private String USERROLES;
	public int getUSERID() {
		return USERID;
	}
	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getUSERPASSWORD() {
		return USERPASSWORD;
	}
	public void setUSERPASSWORD(String uSERPASSWORD) {
		USERPASSWORD = uSERPASSWORD;
	}
	public String getUSERROLES() {
		return USERROLES;
	}
	public void setUSERROLES(String uSERROLES) {
		USERROLES = uSERROLES;
	}
	@Override
	public String toString() {
		return "User [USERID=" + USERID + ", USERNAME=" + USERNAME + ", USERPASSWORD=" + USERPASSWORD + ", USERROLES="
				+ USERROLES + "]";
	}
    
    
}
