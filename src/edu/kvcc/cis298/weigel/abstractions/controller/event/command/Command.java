package edu.kvcc.cis298.weigel.abstractions.controller.event.command;


import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
/**
 * purpose: an event ordering something to be done
 *
 */
public abstract
class Command
	extends Event
{
	public
	Command( String name )
	{
		super( name );
	}
}
