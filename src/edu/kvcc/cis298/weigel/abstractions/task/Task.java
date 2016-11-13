package edu.kvcc.cis298.weigel.abstractions.task;

import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
import edu.kvcc.cis298.weigel.abstractions.controller.Controller;
import edu.kvcc.cis298.weigel.abstractions.application.ModuleLocator;
import edu.kvcc.cis298.weigel.abstractions.task.events.TaskStartedEvent;

public abstract
class Task
{
	private String mName;
	protected Controller mController;

	public Task(String name, Controller controller )
	{
		mName = name;
		mController = controller;
	}

	public abstract
	void initializeTask( ModuleLocator moduleLocator );
	public
	void startTask()
	{
		Event
			event = new TaskStartedEvent();
		mController.handleEvent( event );
	}
	public abstract
	void pauseTask();
	public abstract
	void resumeTask();
	public abstract
	void stopTask();
	public abstract
	void destroyTask();

	protected abstract void onTaskSuccess();

	protected abstract void onTaskFailure();
}
