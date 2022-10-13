package main.test.eu.glowacki.utp.assignment01.sample.test;

import main.java.eu.glowacki.utp.assignment01.sample.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PersonTest {

	private static final int AGE = 20;

	private Person _person;

	@Before
	public void before() {
		_person = new Person(AGE);
		Assert.assertEquals(AGE, _person.age());
	}

	@Test
	public void aggregate() {
		int aggregate = _person.aggregate(null);
		Assert.assertEquals(AGE, aggregate);
		final int init = 20;
		Assert.assertEquals(AGE + init, (int) (_person.aggregate(init)));
	}

	@Test
	public void deepClone() {
		Person clone = _person.deepClone();
		Assert.assertEquals(_person.age(), clone.age());
		Assert.assertNotSame(_person, clone);
	}
}