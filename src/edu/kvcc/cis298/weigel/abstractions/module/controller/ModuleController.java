package edu.kvcc.cis298.weigel.abstractions.module.controller;

import edu.kvcc.cis298.weigel.abstractions.application.controller.ApplicationState;
import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
import edu.kvcc.cis298.weigel.abstractions.controller.Controller;
public abstract
class ModuleController
	extends Controller
{
	private ModuleState
		mModuleState;

	public ModuleController()
	{
		mModuleState = ModuleState.CREATED;
	}

	@Override
	public
	void handleEvent( Event event )
	{
		switch(mModuleState)
		{
			default: // unhandled
				// log and pass to parent
		}
	}

	@Override
	public
	void setApplicationState( ApplicationState nextApplicationState )
	{

	}

	@Override
	protected
	void handleChildControllerEvent( Event event )
	{

	}
}
