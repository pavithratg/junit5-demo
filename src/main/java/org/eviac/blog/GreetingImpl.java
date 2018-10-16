package org.eviac.blog;

public class GreetingImpl implements Greeting {

	@Override
	public String greet(String name) {

		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException();
		}

		return "Hello " + name;
	}
}
