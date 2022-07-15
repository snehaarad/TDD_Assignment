package Junittestcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tdd.specialchar;

public class special_test {

	@Test
	public void test() {
		
        assertEquals("This Red car.",specialchar.removeChar("This@Red$car-."));

	}

}
