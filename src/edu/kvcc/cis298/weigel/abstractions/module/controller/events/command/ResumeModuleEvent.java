package edu.kvcc.cis298.weigel.abstractions.module.controller.events.command;

import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
public
class ResumeModuleEvent
	extends Event
{

	public
	ResumeModuleEvent()
	{
		super( "resume_module" );
	}
}
