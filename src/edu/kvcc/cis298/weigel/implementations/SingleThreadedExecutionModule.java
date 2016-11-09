package edu.kvcc.cis298.weigel.implementations;

import edu.kvcc.cis298.weigel.module.application.execution.ExecutionModule;
import edu.kvcc.cis298.weigel.task.Task;
import edu.kvcc.cis298.weigel.task.TaskQueue;

public
class SingleThreadedExecutionModule
	extends ExecutionModule
{
	private TaskQueue
		mTasks;

	public
	SingleThreadedExecutionModule()
	{
		mTasks
			= new TaskQueue();
	}

	@Override
	public
	void executeTask( Task task )
	{
		task.initializeTask( mModuleLocator );
		task.run();
	}

	@Override
	public
	void startModule()
	{
		// set state to running
		while ( true )
		{
			Task
				task
				= (Task) mTasks.requestTask();
			task.initializeTask( mModuleLocator );
			task.run();
			// 
		}
	}

	@Override
	public
	void pauseModule()
	{
		// set state to pausing
		// save state data
		// set state to pause
	}

	@Override
	public
	void resumeModule()
	{
		// set state to resuming
		// load state data
		// 
		// set state to running
	}

	@Override
	public
	void stopModule()
	{
		// set state to stopping
		// do stuff
		// set state to stopped
	}

	@Override
	public
	void destroyModule()
	{
		// set everything to null
	}
}
