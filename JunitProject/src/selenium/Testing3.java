package selenium;

import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.Assert;
import org.junit.Rule;

public class Testing3 {

	@Rule
	public ErrorCollector err = new ErrorCollector();
	
	
	@Test
	public void test6() {
		
		String actual = "abc";
		String expacted = "abc1";
		System.out.println("before 1st Assert");
		Assert.assertEquals(expacted, actual); // we use regular assert in the industry
		System.out.println("After 1st Assert");
		Assert.assertEquals("After 4>3", 4>3);
		System.out.println("After 2nd Assert");
	}
	
		@Test
		public void test7() {
			String actual = "abc";
			String expacted = "abc1";
			System.out.println("before 1st Assert");
			try {
			Assert.assertEquals(expacted, actual);
			}catch(Throwable t) {
				System.out.println("I'm in first catch");
				err.addError(t);
			}
			System.out.println("After 1st Assert");
			try {
				Assert.assertEquals("After 2>3", 2>3);
			}catch(Throwable t) {
				System.out.println("I'm in Second Catch");
				err.addError(t);
			}
			System.out.println("After 2nd Assert");
		}
	}
	




