package com.yash.tdd;

public class palindrome {
	
	
	public static Object isPalindrome(String str){  
	    StringBuilder sb=new StringBuilder(str);  

	    

	    sb.reverse();  
	    String rev=sb.toString();  
	    if(str.equals(rev)){  
	        return true;  
	    }else{  
	        return false;  
	    }  
	}

	/*public static Object isPalindrome(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	} */ 
	}  

