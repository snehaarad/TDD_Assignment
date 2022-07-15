package com.yash.tdd;

public class Q13th {
	
	  static int result;
	    //Method for addition
	    public static int add(int n1, int n2){
	        result = n1+n2;
	        return result;

	    }
	    //Method for subtraction
	    public static int substract(int n1, int n2){
	        result = n1-n2;
	        return result;
	    }
	    //Method for multiplication
	    public static int multiply(int n1, int n2){
	        result = n1*n2;
	        return result;
	    }
	    //Method for division
	    public static int divide(int n1, int n2){
	        result = n1/n2;
	         if (n2 == 0)
	                throw new IllegalArgumentException("Cannot divide by zero!");
	        System.out.println(result);
	        return result;
	    }

	    public static int modulus(int n1, int n2){
	        result = n1%n2;
	         if (n2 == 0)
	                throw new IllegalArgumentException("Cannot divide by zero!");
	        System.out.println(result);

	        return result;
	}
	    public static int power(int n1,int power){
	        int result1=0;
	        result1 = (int) Math.pow(n1,power);
	        if (power<0) 
	            throw new IllegalArgumentException("power is always positive!");


	        else 
	            return result1;

	}
	    public static int squareroot(int n1){
	         int result1 = (int) Math.sqrt(n1);
	        return result1;    
	}
	    public static int cuberoot( int n2){
	    int result2 = (int) Math.cbrt(n2);
	        return result2;
	}
	}




