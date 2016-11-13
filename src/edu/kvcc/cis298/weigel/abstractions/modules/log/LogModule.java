package edu.kvcc.cis298.weigel.abstractions.modules.log;

import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
import edu.kvcc.cis298.weigel.abstractions.module.Module;

public abstract
class LogModule
	extends Module
{
	public
	LogModule()
	{
		super( "log" );
	}

	public abstract
	void log( String message );

	public abstract
	void log( Event event );
}
