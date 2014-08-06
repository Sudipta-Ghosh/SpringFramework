package com.tutorial.spring3.core;
 
public class Person 
{
	private Ability ability;

	Person(Ability ability){
		this.ability=ability;
	}

	@Override
	public String toString() {
		return "Person [ability=" + ability + "]";
	}

}