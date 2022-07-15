package com.yash.tdd;

import java.util.ArrayList;
import java.util.List;

class user{
	
	 String email;
	 String password;
	public String getEmail() {
	return email;
}
public void setEmail(String email) {
this.email = email;}
	public user() {
super();
	}
	public user(String email, String password) {
	super();
	 this.email = email;
	this.password = password; }
public String getPassword() {
	return password; }
	public void setPassword(String password) {
		this.password = password;
}
	}
	
	public class Q3rd {

static List<user> a=new ArrayList<>();
	 public static void main(String[] args) {
	System.out.println(); }
	public static boolean checkEmailandPassword(String email,String password) {
	a.add(new user("sneha@gmail.com","sneha123"));
	a.add(new user("swati@gmail.com","swati123"));
	a.add(new user("swapnil@gmail.com","swap123"));

	for(int i=0;i<=a.size()-1;i++) {
	if(a.get(i).email.contains(email)&&a.get(i).password.contains(password)) {
     return true;
}break;
}
	return false;}
 }




