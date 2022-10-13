package main.java.eu.glowacki.utp.assignment01.sample;

import main.java.eu.glowacki.utp.assignment01.IAggregable;
import main.java.eu.glowacki.utp.assignment01.IDeeplyCloneable;
import main.java.eu.glowacki.utp.assignment01.IContainer;
import main.java.eu.glowacki.utp.assignment01.GenericsCollect.*;

public final class Person implements IAggregable<Person, Integer>, IDeeplyCloneable<Person> {
	
	private final int _age;
	
	public Person(int age) {
		//
		_age = age;
	}
	
	public int age() {
		//
		return _age;
	}

	public Integer aggregate(Integer partial) {
		if  (partial == null) {
			return _age;
		}
		return _age + partial;
	}
	
	public Person deepClone() {
		//
		return new Person(_age);
	}
}