package edu.kvcc.cis298.weigel.abstractions.controller.event.result;


import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
/**
 * purpose: an event stemming from a task's completion
 */
public abstract
class Result
	extends Event
{
	public
	Result( String name )
	{
		super( name );
	}
}
