package edu.kvcc.cis298.weigel.abstractions.controller;

import edu.kvcc.cis298.weigel.abstractions.application.controller.ApplicationState;
import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;

import java.util.ArrayList;
import java.util.List;

public
abstract
class Controller
	implements EventHandler
{
	private Controller
		mParentController;
	private
	List<Controller>
		mChildControllers;
	private State
		mState;

	public
	Controller()
	{
		//mState = State.created;
		mChildControllers
			= new ArrayList<Controller>();
	}

	public
	void setParentController( Controller controller )
	{
		mParentController
			= controller;
	}

	public abstract
	void setApplicationState(
		                        ApplicationState
			                        nextApplicationState
	                        );

	protected abstract
	void handleChildControllerEvent(
		                               Event
			                               event
	                               );
}
