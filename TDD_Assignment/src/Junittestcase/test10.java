package Junittestcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Q10th;

public class test10 {

	@Test
	public void test() {
		
		
        assertEquals("Apple-orange-banana-lemon",Q10th.concatString(new String[]{"Apple", "orange","banana","lemon"}));

	}

}
