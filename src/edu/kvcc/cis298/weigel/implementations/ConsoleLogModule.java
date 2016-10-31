package edu.kvcc.cis298.weigel.implementations;
import edu.kvcc.cis298.weigel.module.Event;
import edu.kvcc.cis298.weigel.module.application.LogModule;

public class ConsoleLogModule
	extends LogModule
{
	@Override
	public void log( String message )
	{
		System.out.println( message );
	}

	@Override
	public void log( Event event )
	{
		System.out.println( event.toString() );
	}
}
