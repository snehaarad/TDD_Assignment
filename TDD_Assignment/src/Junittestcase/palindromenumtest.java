package Junittestcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.palindromenumber;

public class palindromenumtest {

	@Test
	public void test() {
assertEquals(true,palindromenumber.ispalidrome(121));	}

}
