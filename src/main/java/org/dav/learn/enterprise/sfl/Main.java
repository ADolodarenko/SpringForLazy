package org.dav.learn.enterprise.sfl;

import org.dav.learn.enterprise.sfl.config.MyConfig;
import org.dav.learn.enterprise.sfl.entities.animal.Cat;
import org.dav.learn.enterprise.sfl.entities.animal.Dog;
import org.dav.learn.enterprise.sfl.entities.animal.Parrot;
import org.dav.learn.enterprise.sfl.entities.day.WeekDay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		Cat cat = context.getBean(Cat.class);
		Dog dog = (Dog) context.getBean("dog");
		Parrot parrot = context.getBean("parrot-fucker", Parrot.class);
		WeekDay currentDay = context.getBean(WeekDay.class);

		System.out.println(cat.getName());
		System.out.println(dog.getName());
		System.out.println(parrot.getName());

		System.out.println("It's " + currentDay.getWeekDayName() + " today!");
	}
}
