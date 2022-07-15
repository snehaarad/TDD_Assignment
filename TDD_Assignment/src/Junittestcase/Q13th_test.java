package Junittestcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import com.yash.tdd.Q13th;

public class Q13th_test {

		@Test
		public void add() {
			assertEquals(38, Q13th.add(15, 23));

		}
		@Test
		public void sub() {
			assertEquals(-10, Q13th.substract(100,110));
		}
		@Test
		public void mul() {
			assertEquals(1500, Q13th.multiply(15, 100));
		}
		@Test
		public void mod() {
			assertEquals(5, Q13th.modulus(15, 10));
		}
		@Test
		public void pow() {
			assertEquals(25, Q13th.power(5, 2));

			try {
				assertEquals(25, Q13th.power(5, -1));

			}catch(IllegalArgumentException e) {
				System.out.println("not Executed");
				System.out.println("Exception="+e);
			}

		}
		@Test
		public void sqrt() {
			assertEquals(5, Q13th.squareroot(25));
		}
		@Test
		public void cube() {
			assertEquals(2, Q13th.cuberoot(8));
		}
		@Test
		public void testExceptionThrown() {
			Q13th  test=new Q13th();

			assertEquals(2, Q13th.divide(4, 2));
			try {
				assertEquals(2, Q13th.divide(100, 0));
			}catch(ArithmeticException e) {
				System.out.println("not Executed");
				System.out.println("Exception="+e);

			}
		}

		@Test
		public void TestExceptionThrown2() {
			Q13th cal=new Q13th();
			assertEquals(0, Q13th.modulus(4, 2));
			try {
				assertEquals(2, Q13th.modulus(100, 0));
			}catch(ArithmeticException e){
				System.out.println("not Executed");
				System.out.println("Exception="+e);

			}


		}
	}
