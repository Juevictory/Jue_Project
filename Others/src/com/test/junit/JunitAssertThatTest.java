package com.test.junit;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

public class JunitAssertThatTest {

	private User tom;

	private User john;

	/**
	 * 
	 */
	@Before
	public void init() {
		tom = new User(20, "Tom");
		john = new User(60, "John");
	}

	@Test
	public void testAssertThat(){
		assertThat(this.tom.getId(),Matchers.greaterThan(50));
	}
	/**
	 * 
	 * @author JueVictory
	 *
	 */
	class User {

		private int id;

		private String name;

		public User(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
