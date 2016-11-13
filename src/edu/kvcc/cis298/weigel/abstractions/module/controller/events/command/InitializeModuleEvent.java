package edu.kvcc.cis298.weigel.abstractions.module.controller.events.command;


import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
public
class InitializeModuleEvent
	extends Event
{
	public
	InitializeModuleEvent(  )
	{
		super( "initialize_module" );
	}
}
