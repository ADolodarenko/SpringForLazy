package org.dav.learn.enterprise.sfl;

import org.dav.learn.enterprise.sfl.entities.Cat;
import org.dav.learn.enterprise.sfl.entities.Dog;
import org.dav.learn.enterprise.sfl.entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"org.dav.learn.enterprise.sfl.entities");

		Cat cat = context.getBean(Cat.class);
		Dog dog = (Dog) context.getBean("dog");
		Parrot parrot = context.getBean("parrot-fucker", Parrot.class);

		System.out.println(cat.getName());
		System.out.println(dog.getName());
		System.out.println(parrot.getName());
	}
}
