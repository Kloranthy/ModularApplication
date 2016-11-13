package edu.kvcc.cis298.weigel.abstractions.module.controller.events.command;


import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
public
class StartModuleEvent
	extends Event
{
	public
	StartModuleEvent()
	{
		super( "start_module" );
	}
}
