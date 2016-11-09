package edu.kvcc.cis298.weigel.module.application.controller;

import edu.kvcc.cis298.weigel.task.Task;

import java.util.HashMap;

public
class State
{
	//created, ready, running, stopping, stopped;
	// enum states
	private State
		mState;
	private HashMap<State, Task>
		mTransitions;

	public static
	void main( String[] args )
	{
		State
			state
			= new State();
	}

	public
	void updateState( State state )
	{
		if ( mState.canTransitionTo( state ) )
		{
			mState.transitionTo( state );
		}
	}

	private
	void transitionTo( State state )
	{
		if ( mState.canTransitionTo( state ) )
		{
			mState
				= state;
			// event stuff
		}
		else
		{
			// event stuff
		}
	}

	public
	void setTransitionTo(
		                    State state,
		                    Task task
	                    )
	{
		mTransitions.put(
			state,
			task
		                );
	}

	public
	boolean canTransitionTo( State state )
	{
		if ( mTransitions.containsKey( state ) )
		{
			return mState.getTransitionTo( state )
			       != null;
		}
		else
		{
			return false;
		}
	}

	private
	Task getTransitionTo( State state )
	{
		return mState.getTransitionTo( state );
	}
}
