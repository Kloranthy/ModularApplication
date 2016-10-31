package edu.kvcc.cis298.weigel.module.application;
import edu.kvcc.cis298.weigel.module.Event;

public abstract class LogModule
{
	public abstract void log( String message );

	public abstract void log( Event event );
}
