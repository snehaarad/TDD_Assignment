package com.yash.tdd;

public class specialchar {



	public static String removeChar(String str) {
			str = str.replaceAll("[@$]", " ");
			str = str.replaceAll("[-]", "");
			return str;
	}
	



}


