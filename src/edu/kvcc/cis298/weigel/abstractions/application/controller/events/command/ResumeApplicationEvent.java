package edu.kvcc.cis298.weigel.abstractions.application.controller.events.command;

import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
public
class ResumeApplicationEvent
	extends Event
{
	public
	ResumeApplicationEvent()
	{
		super( "resume_application_event" );
	}
}
