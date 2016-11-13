package edu.kvcc.cis298.weigel.implementations.modules.execution;

import edu.kvcc.cis298.weigel.abstractions.application.ModuleLocator;
import edu.kvcc.cis298.weigel.abstractions.modules.execution.ExecutionModule;
import edu.kvcc.cis298.weigel.abstractions.task.Task;

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
		task.startTask();
	}

	@Override
	public
	void initializeModule( ModuleLocator moduleLocator )
	{

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
			task.startTask();
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
