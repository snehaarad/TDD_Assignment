package com.yash.tdd;

public class strpalindrome {


	public static boolean isPalindrome(){  

		String s1="";
		String s2="";


		for(int i=s1.length()-1;i>=0;i--)

			s2=s2+s1.charAt(i);
		if(s1.equals(s2))
		{
			return true;
		}
		else
		{
			return false;
		}

	}


}
