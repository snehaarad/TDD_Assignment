package Junittestcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Item;

public class item_test {

	
	//itemid should have atleast 3 digit  
	@Test
	public void test() {

		//Item item=new Item(12,"pen",10,15,"10-10-2018","20-08-2022");
		assertEquals(true,Item.itemidmethod(1000));
	}


   //Itemname contain only alphabets
	@Test
	public void test1() {

		assertEquals(true,Item.isStringOnlyAlphabet("ABcd"));
	}

	
	//price cannot contain negative numbers
	@Test
	public void test2() {

		assertEquals(true,Item.pricemethod(100));
	}
	
	//dateofexp cannot be today
	@Test
	public void test3() {

		assertEquals(true,Item.dateofdexpmethod("25-07-2022"));
	}
	
	
    //cost_price and sell_price should not be same
	@Test
	public void test4() {

		assertEquals(true,Item.costsellmethod(100,200));
	}


}
