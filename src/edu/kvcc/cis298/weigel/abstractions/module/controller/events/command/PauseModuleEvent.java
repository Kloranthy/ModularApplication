package edu.kvcc.cis298.weigel.abstractions.module.controller.events.command;

import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
public
class PauseModuleEvent
	extends Event
{

	public
	PauseModuleEvent()
	{
		super( "pause_module" );
	}
}
