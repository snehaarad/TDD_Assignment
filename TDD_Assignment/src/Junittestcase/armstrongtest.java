package Junittestcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.armstrong;

public class armstrongtest {

	@Test
	public void test() {
		
		assertEquals(true, armstrong.isArmstrong(1));
	}

}
