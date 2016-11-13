package edu.kvcc.cis298.weigel.abstractions.module;

import edu.kvcc.cis298.weigel.abstractions.application.ModuleLocator;
import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
import edu.kvcc.cis298.weigel.abstractions.module.controller.ModuleController;
import edu.kvcc.cis298.weigel.abstractions.module.controller.ModuleState;
import edu.kvcc.cis298.weigel.abstractions.module.controller.events.command.*;
public abstract
class Module
{
	protected ModuleLocator
		mModuleLocator;
	private   String
		mName;
	private
	ModuleController mController;

	public
	Module( String name )
	{
		mName
			= name;
	}

	public void setModuleController( ModuleController controller )
	{
		mController = controller;
	}

	public
	String getName()
	{
		return mName;
	}

	public
	void initializeModule(ModuleLocator moduleLocator)
	{
		Event
			event = new InitializeModuleEvent();
		mController.handleEvent( event );
	}

	public
	void startModule()
	{
		Event
			event = new StartModuleEvent();
		mController.handleEvent( event );
	}

	public
	void pauseModule()
	{
		Event
			event = new PauseModuleEvent();
		mController.handleEvent( event );
	}

	public
	void resumeModule()
	{
		Event
			event = new ResumeModuleEvent();
		mController.handleEvent( event );
	}

	public
	void stopModule()
	{
		Event
			event = new StopModuleEvent();
		mController.handleEvent( event );
	}

	public
	void destroyModule()
	{
		Event
			event = new DestroyModuleEvent();
		mController.handleEvent( event );
	}

	public void submitEvent(Event event)
	{

	}
}
