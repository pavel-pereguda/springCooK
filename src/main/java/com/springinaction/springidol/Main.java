package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
			"spring/settings.xml");
		Performer performer = (Performer) ctx.getBean("PoeticJuggler");


		performer.perform();
	}

}