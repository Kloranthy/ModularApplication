package edu.kvcc.cis298.weigel.abstractions.application.controller.events.command;

import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
public
class PauseApplicationEvent
	extends Event
{
	public
	PauseApplicationEvent()
	{
		super( "pause_application_event" );
	}
}
