package org.dav.learn.enterprise.sfl.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat
{
	private String name;

	public Cat()
	{
		name = "The Cat!";
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
