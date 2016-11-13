package edu.kvcc.cis298.weigel.abstractions.module.controller.events.command;

import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
public
class StopModuleEvent
	extends Event
{
	public
	StopModuleEvent(  )
	{
		super( "stop_module" );
	}
}
