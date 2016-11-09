package edu.kvcc.cis298.weigel.module.application;

import edu.kvcc.cis298.weigel.event.Event;
import edu.kvcc.cis298.weigel.module.Module;

public abstract
class LogModule
	extends Module
{
	public
	LogModule()
	{
		super( "Log" );
	}

	public abstract
	void log( String message );

	public abstract
	void log( Event event );
}
