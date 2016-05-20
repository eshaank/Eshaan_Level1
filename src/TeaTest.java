
// Copyright Wintriss Technical Schools 2013
import org.junit.Test;

import junit.framework.Assert;

public class TeaTest {
	/**
	 * Jane Austen is a women, so say “Hello Ms. Austen”. George Orwell is a man, so say “Hello Mr. Orwell”. Isaac
	 * Newton was knighted, so say Hello Sir Newton.
	 **/

	@Test
	public void test() {
		TeaParty teaParty = new TeaParty();
		teaParty.welcome(null, false, false);
		Assert.assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
		Assert.assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
		Assert.assertEquals("Hello Sir Newton", teaParty.welcome("Newton", false, true));
	}
}
