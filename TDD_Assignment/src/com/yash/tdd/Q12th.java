package com.yash.tdd;

public class Q12th {
	
	String name;
	String lastname;
	public Q12th(String name, String lastname) {
		
		this.name = name;
		this.lastname = lastname;
	}
	
	
	@Override
	public  boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Q12th that = (Q12th) o;
	    return name.equals(that.name) &&
	      lastname.equals(that.lastname);
	}

	
	

}
