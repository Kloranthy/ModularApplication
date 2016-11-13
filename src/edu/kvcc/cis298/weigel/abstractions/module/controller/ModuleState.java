package edu.kvcc.cis298.weigel.abstractions.module.controller;

public
enum ModuleState
{
	CREATED( "Created" ),
	INITIALIZING( "Initializing" ),
	READY( "Ready" ),
	STARTING( "Starting" ),
	RUNNING( "Running" ),
	PAUSING( "Pausing" ),
	PAUSED( "Paused" ),
	RESUMING( "Resuming" ),
	STOPPING( "Stopping" ),
	STOPPED( "Stopped" ),
	DESTROYED( "Destroyed" );
	private String
		mName;

	// tempted to give each state an events handler
	private
	ModuleState( String name )
	{
		mName
			= name;
	}

	public static
	boolean canTransition(
		                     ModuleState fromModuleState,
		                     ModuleState toModuleState
	                     )
	{
		switch ( fromModuleState.getName() )
		{
			case "Created":
				switch ( toModuleState.getName() )
				{
					case "Created":
						// log already in state
						return false;
					case "Initializing":
						return true;
					case "Ready":
						return false;
					case "Starting":
						return false;
					case "Running":
						return false;
					case "Pausing":
						return false;
					case "Paused":
						return false;
					case "Resuming":
						return false;
					case "Stopping":
						return true;
					case "Stopped":
						return false;
					case "Destroyed":
						return false;
					default:
						//wtf
						return false;
				}
			case "Initializing":
				switch ( toModuleState.getName() )
				{
					case "Created":
						return false;
					case "Initializing":
						// log already in state
						return false;
					case "Ready":
						return true;
					case "Starting":
						return false;
					case "Running":
						return false;
					case "Pausing":
						return false;
					case "Paused":
						return false;
					case "Resuming":
						return false;
					case "Stopping":
						return true;
					case "Stopped":
						return false;
					case "Destroyed":
						return false;
					default:
						//wtf
						return false;
				}
			case "Ready":
				switch ( toModuleState.getName() )
				{
					case "Created":
						return false;
					case "Initializing":
						return false;
					case "Ready":
						// log already in state
						return false;
					case "Starting":
						return true;
					case "Running":
						return false;
					case "Pausing":
						return false;
					case "Paused":
						return false;
					case "Resuming":
						return false;
					case "Stopping":
						return true;
					case "Stopped":
						return false;
					case "Destroyed":
						return false;
					default:
						//wtf
						return false;
				}
			case "Starting":
				switch ( toModuleState.getName() )
				{
					case "Created":
						return false;
					case "Initializing":
						return false;
					case "Ready":
						return false;
					case "Starting":
						// log already in state
						return false;
					case "Running":
						return true;
					case "Pausing":
						return false;
					case "Paused":
						return false;
					case "Resuming":
						return false;
					case "Stopping":
						return true;
					case "Stopped":
						return false;
					case "Destroyed":
						return false;
					default:
						//wtf
						return false;
				}
			case "Running":
				switch ( toModuleState.getName() )
				{
					case "Created":
						return false;
					case "Initializing":
						return false;
					case "Ready":
						return false;
					case "Starting":
						return false;
					case "Running":
						// log already in state
						return false;
					case "Pausing":
						return true;
					case "Paused":
						return false;
					case "Resuming":
						return false;
					case "Stopping":
						return true;
					case "Stopped":
						return false;
					case "Destroyed":
						return false;
					default:
						//wtf
						return false;
				}
			case "Pausing":
				switch ( toModuleState.getName() )
				{
					case "Created":
						return false;
					case "Initializing":
						return false;
					case "Ready":
						return false;
					case "Starting":
						return false;
					case "Running":
						return false;
					case "Pausing":
						// log already in state
						return false;
					case "Paused":
						return true;
					case "Resuming":
						return false;
					case "Stopping":
						return true;
					case "Stopped":
						return false;
					case "Destroyed":
						return false;
					default:
						//wtf
						return false;
				}
			case "Resuming":
				switch ( toModuleState.getName() )
				{
					case "Created":
						return false;
					case "Initializing":
						return false;
					case "Ready":
						return false;
					case "Starting":
						return false;
					case "Running":
						return true;
					case "Pausing":
						return false;
					case "Paused":
						return false;
					case "Resuming":
						// log already in state
						return false;
					case "Stopping":
						return true;
					case "Stopped":
						return false;
					case "Destroyed":
						return false;
					default:
						//wtf
						return false;
				}
			case "Stopping":
				switch ( toModuleState.getName() )
				{
					case "Created":
						return false;
					case "Initializing":
						return false;
					case "Ready":
						return false;
					case "Starting":
						return false;
					case "Running":
						return false;
					case "Pausing":
						return false;
					case "Paused":
						return false;
					case "Resuming":
						return false;
					case "Stopping":
						// log already in state
						return false;
					case "Stopped":
						return true;
					case "Destroyed":
						return false;
					default:
						//wtf
						return false;
				}
			case "Stopped":
				switch ( toModuleState.getName() )
				{
					case "Created":
						return false;
					case "Initializing":
						return false;
					case "Ready":
						return false;
					case "Starting":
						return false;
					case "Running":
						return false;
					case "Pausing":
						return false;
					case "Paused":
						return false;
					case "Resuming":
						return false;
					case "Stopping":
						return false;
					case "Stopped":
						// log already in state
						return false;
					case "Destroyed":
						return true;
					default:
						//wtf
						return false;
				}
			case "Destroyed":
				switch ( toModuleState.getName() )
				{
					case "Created":
						return false;
					case "Initializing":
						return false;
					case "Ready":
						return false;
					case "Starting":
						return false;
					case "Running":
						return false;
					case "Pausing":
						return false;
					case "Paused":
						return false;
					case "Resuming":
						return false;
					case "Stopping":
						return false;
					case "Stopped":
						return false;
					case "Destroyed":
						// log already in state
						return false;
					default:
						//wtf
						return false;
				}
			default:
				//wtf
				return false;
		}
	}

	public
	String getName()
	{
		return mName;
	}
}
