package edu.kvcc.cis298.weigel.module.program.task;

import edu.kvcc.cis298.weigel.module.ModuleLocator;
import edu.kvcc.cis298.weigel.task.Task;

public abstract
class InitProgramTask
	extends Task
{
	// private variables
	private ModuleLocator
		mModuleLocator;

	// public methods
	@Override
	public
	void initializeTask( ModuleLocator moduleLocator )
	{
		mModuleLocator
			= moduleLocator;
	}

	@Override
	public abstract
	void run();
}
