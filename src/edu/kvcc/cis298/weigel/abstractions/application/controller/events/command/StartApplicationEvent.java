package edu.kvcc.cis298.weigel.abstractions.application.controller.events.command;


import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
public
class StartApplicationEvent
	extends Event
{
	public
	StartApplicationEvent()
	{
		super( "start_application_event" );
	}
}
