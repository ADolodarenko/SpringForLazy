package org.dav.learn.enterprise.sfl.entities;

import org.springframework.stereotype.Component;

@Component
public class Dog
{
	private String name;

	public Dog()
	{
		name = "The Dog!";
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
}
