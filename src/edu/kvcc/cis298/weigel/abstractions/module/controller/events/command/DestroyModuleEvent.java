package edu.kvcc.cis298.weigel.abstractions.module.controller.events.command;

import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
public
class DestroyModuleEvent
	extends Event
{
	public
	DestroyModuleEvent(  )
	{
		super( "destroy_module" );
	}
}
