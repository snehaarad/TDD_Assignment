package com.yash.tdd;

public class Q11th {
	
	 private static volatile Q11th s = new Q11th();
     
	    private Q11th() {
	         
	    }
	     
	    public static Q11th getInstance(){
	        return s;
	    }
	 
	}



