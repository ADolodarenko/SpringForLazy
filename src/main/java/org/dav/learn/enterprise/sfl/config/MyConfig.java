package org.dav.learn.enterprise.sfl.config;

import org.dav.learn.enterprise.sfl.entities.day.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("org.dav.learn.enterprise.sfl.entities.animal")
public class MyConfig
{
	@Bean
	public WeekDay getDay()
	{
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

		switch (dayOfWeek)
		{
			case MONDAY: return new Monday();
			case TUESDAY: return new Tuesday();
			case WEDNESDAY: return new Wednesday();
			case THURSDAY: return new Thursday();
			case FRIDAY: return new Friday();
			case SATURDAY: return new Saturday();
			default: return new Sunday();
		}
	}
}
