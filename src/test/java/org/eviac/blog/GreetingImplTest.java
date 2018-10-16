package org.eviac.blog;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class GreetingImplTest {

	private Greeting greet;

	@BeforeEach
	public void setup() {
		System.out.println("setup");
		greet = new GreetingImpl();
	}

	@Test
	public void greetingShouldReturnValidOutput() {
		System.out.println("greetingShouldReturnValidOutput");
		String result = greet.greet("Junit");
		Assertions.assertNotNull(result);
		Assertions.assertEquals("Hello Junit", result);
	}

	@Test
	public void greetingShouldThrowExceptionOnNullValue() {
		System.out.println("greetingShouldThrowExceptionOnNullValue");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greet.greet(null);
		});
	}

	@Test
	public void greetingShouldThrowExceptionOnEmptyValue() {
		System.out.println("greetingShouldThrowExceptionOnEmptyValue");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greet.greet("");
		});
	}

	@AfterEach
	public void teardown() {
		System.out.println("teardown");
		greet = null;
	}
}
