package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class Saxophone implements Instrument
{

	public Saxophone()
	{
	}

	public void play()
	{
		System.out.println("TOOT TOOT TOOT");
	}
}


