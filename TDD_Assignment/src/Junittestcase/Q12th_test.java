package Junittestcase;
import org.junit.Assert;
import org.junit.Test;

import com.yash.tdd.Q12th;

public class Q12th_test {

	@Test
	public void test() {


		Q12th q=new Q12th("sneha","aradwad");
		Q12th q1=new Q12th("sneha","aradwad");
		Assert.assertEquals(q, q1);
	}

}
//assertThat(Objects.equals(q,q1)).isTrue();
