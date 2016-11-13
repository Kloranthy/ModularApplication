package edu.kvcc.cis298.weigel.abstractions.application.controller.events.command;

import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
public
class StopApplicationEvent
	extends Event
{
	public
	StopApplicationEvent()
	{
		super( "stop_application_event" );
	}
}
