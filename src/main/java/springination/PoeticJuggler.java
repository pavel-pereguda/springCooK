package springination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PoeticJuggler extends Juggler
{

@Autowired
	private Poem poem;



	public PoeticJuggler(Poem poem)
	{ // Внедрение поэмы
		super();
		this.poem = poem;
	}

	public PoeticJuggler(int beanBags, Poem poem)
	{
		// Внедрение количества
		super(beanBags);
		// мячиков и поэмы
		this.poem = poem;
	}

	public void perform()
	{
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
