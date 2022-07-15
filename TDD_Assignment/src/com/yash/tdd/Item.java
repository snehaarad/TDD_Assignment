package com.yash.tdd;

public class Item {

	static int itemid;
	String itemname;
	int cost_price;
	int sell_price;
	String dateofmanu;
	String dateofexp;


	public Item(int itemid, String itemname, int cost_price, int sell_price, String dateofmanu, String dateofexp) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.cost_price = cost_price;
		this.sell_price = sell_price;
		this.dateofmanu = dateofmanu;
		this.dateofexp = dateofexp;
	}

	//itemid should have at least 3 digit
	public static boolean itemidmethod(int itemid)
	{
		if(itemid>=100) {
			//	System.out.println("true");
			return true;}
		return false;
	}


	public static boolean isStringOnlyAlphabet(String itemname) 
	{
		return ((!itemname.equals(""))
				&& (itemname != null)
				&& (itemname.matches("^[a-zA-Z]*$")));
	}

	public static boolean pricemethod(int price)
	{
		if(price>=0) {
			//	System.out.println("true");
			return true;}
		return false;
	}



	public static boolean dateofdexpmethod(String dateofexp)
	{
		if(dateofexp!="30-06-2022") {
			//	System.out.println("true");
			return true;}
		return false;
	}


	public static boolean costsellmethod( int cost_price,int sell_price)
	{
		if(cost_price!=sell_price) {
			//	System.out.println("true");
			return true;
		}
		return false;
	}


}
