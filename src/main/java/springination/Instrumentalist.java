package springination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Instrumentalist implements Performer
{
	public Instrumentalist()
	{
	}

	public void perform()
	{
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}

	private String song;

	public void setSong(String song)
	{
		// Внедрение мелодии
		this.song = song;
	}

	public String getSong()
	{
		return song;
	}

	public String screamSong()
	{
		return song;
	}


	@Autowired
	private Instrument instrument;


}

