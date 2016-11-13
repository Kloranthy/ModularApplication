package edu.kvcc.cis298.weigel.abstractions.application.controller.events.result;

import edu.kvcc.cis298.weigel.abstractions.controller.event.result.Result;
public
class ApplicationCreatedEvent
	extends Result
{
	public
	ApplicationCreatedEvent( String name )
	{
		super( name );
	}
}
