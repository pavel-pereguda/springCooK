package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PoeticJuggler extends Juggler
{

	@Autowired
	private Poem poem;

	@Autowired
	@Qualifier("Saxophone")
	private Instrument instrument;


	public void perform()
	{
		super.perform();
		System.out.println("While reciting...");
		poem.recite();

		System.out.println("Try to play:");
		instrument.play();
	}
}
