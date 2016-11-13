package edu.kvcc.cis298.weigel.abstractions.controller;

import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
public
interface EventHandler
{
	public
	void handleEvent( Event event );
}
