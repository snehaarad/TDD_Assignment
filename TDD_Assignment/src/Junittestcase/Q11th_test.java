package Junittestcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.Q11th;

public class Q11th_test {

	@Test
	public void test() {
		
		Q11th s1 = Q11th.getInstance();
    	Q11th s2 = Q11th.getInstance();
        System.out.println("checking singleton objects equality");
        assertEquals(true, s1==s2);
         	
		
	}

}
