package edu.kvcc.cis298.weigel.module.application;

import edu.kvcc.cis298.weigel.event.Event;
import edu.kvcc.cis298.weigel.module.ModuleLocator;

public
class ApplicationController
{
	// private
	// command queue
	// event queue(s?)
	// event handler?(s?)
	// executorModule
	private LogModule
		mLogModule;
	private ApplicationState
		mApplicationState;

	public
	ApplicationController()
	{
		mApplicationState
			= ApplicationState.CREATED;
	}

	public
	void initialize( ModuleLocator moduleLocator )
	{
		mApplicationState
			= ApplicationState.INITIALIZING;
		mLogModule
			= (LogModule) moduleLocator.getModule( "Log" );
		// initialize other fields
		// initialize other modules?
	}

	//
	public
	void handleEvent( Event event )
	{
		switch ( mApplicationState )
		{
			case CREATED:
				switch ( event
					         .getClass()
					         .getName() )
				{
					//case initialize
					// create initialize task(s?)
					// execute tasks
					//case stop/shutdown
					// create shutdown task(s?)
					// execute tasks
					//break;
					default: // unhandled
						// throw error? at least log
						// transition to stopping
						// create shutdown task(s?)
						// execute tasks
				}
				break;
			case INITIALIZING:
				break;
			case READY:
				break;
			case STARTING:
				break;
			case RUNNING:
				break;
			case PAUSING:
				break;
			case PAUSED:
				break;
			case RESUMING:
				break;
			case STOPPING:
				// log that events received while stopping
				break;
			case STOPPED:
				// log that events received while stopped
				break;
			case DESTROYED:
				// log that events received while destroyed
				break;
			default: // unhandled event
				// log and execute stop task
				break;
		}
	}

	public
	void setApplicationState( ApplicationState nextApplicationState )
	{
		if ( ApplicationState.canTransition(
			mApplicationState,
			nextApplicationState
		                                   ) )
		{
			mApplicationState
				= nextApplicationState;
		}
		else
		{
			mApplicationState
				= ApplicationState.STOPPING;
		}
	}
}
