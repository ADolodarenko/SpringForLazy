package org.dav.learn.enterprise.sfl.entities.animal;

import org.springframework.stereotype.Component;

@Component("parrot-fucker")
public class Parrot
{
	private String name;

	public Parrot()
	{
		name = "The Parrot!";
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
