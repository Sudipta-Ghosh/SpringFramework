package com.tutorial.spring3.core;

import org.springframework.beans.factory.annotation.Autowired;
 
public class Person 
{
	
	private Ability ability;
   
	
	public Ability getAbility() {
		return ability;
	}

    @Autowired
	public void setAbility(Ability ability) {
		this.ability = ability;
	}


	@Override
	public String toString() {
		return "SpringExamples_AutoWiring_Annotation_Setter Person [ability=" + ability + "]";
	}

}