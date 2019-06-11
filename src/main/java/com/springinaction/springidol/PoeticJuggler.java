package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PoeticJuggler extends Juggler
{

	@Autowired
	private Poem poem;

	public void perform()
	{
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
