package Junittestcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Q3rd;

public class Q3rd_test {

	@Test
	public void test() {
		
        assertEquals(true,Q3rd.checkEmailandPassword("sneha@gmail.com", "sneha123"));

	}

}
