package com.tutorial.spring3.core;

import org.springframework.beans.factory.annotation.Autowired;
 
public class Person 
{
	
	private Ability ability;
   
	@Autowired
	Person(Ability objAbility){
		this.ability=objAbility;
	}

	@Override
	public String toString() {
		return "SpringExamples_AutoWiring_Annotation_Constructor Person [ability=" + ability + "]";
	}

}