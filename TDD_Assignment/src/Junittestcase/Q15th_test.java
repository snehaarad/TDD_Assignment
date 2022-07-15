package Junittestcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Q15th;

import Javaassignment.item;

public class Q15th_test {


	@Test
public void test() throws Exception
	{

        assertEquals(true,Q15th.checkItemClass(111,"pen",20,25.50,"30/03/2021","09/07/2022"));

	}

}
