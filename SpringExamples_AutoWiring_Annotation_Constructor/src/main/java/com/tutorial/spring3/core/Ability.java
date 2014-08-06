package com.tutorial.spring3.core;
 
public class Ability 
{
	private String strSkill;
	private String skill;//private int skill; Caused by: org.springframework.beans.TypeMismatchException: Failed to convert property value of type 'java.lang.String' to required type 'int' for property 'skill'; nested exception is java.lang.NumberFormatException: For input string: "Invisible"
	
	public String getStrSkill() {
		return strSkill;
	}

	public void setStrSkill(String strSkill) {
		this.strSkill = strSkill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

    @Override
	public String toString() {
		return "Ability [skill=" + skill + "]";
	}

}