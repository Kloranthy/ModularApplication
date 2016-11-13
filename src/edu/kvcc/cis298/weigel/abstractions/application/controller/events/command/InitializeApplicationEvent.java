package edu.kvcc.cis298.weigel.abstractions.application.controller.events.command;


import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
public
class InitializeApplicationEvent
	extends Event
{
	public
	InitializeApplicationEvent()
	{
		super( "initialize_application_event" );
	}
}
