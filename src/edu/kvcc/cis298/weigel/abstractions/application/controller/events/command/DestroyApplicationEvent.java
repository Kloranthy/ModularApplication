package edu.kvcc.cis298.weigel.abstractions.application.controller.events.command;

import edu.kvcc.cis298.weigel.abstractions.controller.event.command.Command;
public
class DestroyApplicationEvent
	extends Command
{
	public
	DestroyApplicationEvent()
	{
		super( "destroy_application" );
	}
}
