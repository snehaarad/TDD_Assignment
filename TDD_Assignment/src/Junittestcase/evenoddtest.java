package Junittestcase;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.yash.tdd.evenorodd;

public class evenoddtest {

	@Test
	public void test() {
		
		evenorodd a=new evenorodd();
        assertTrue(a.even(new int[] {36,8,5,65,12},8));

		
	}

}


