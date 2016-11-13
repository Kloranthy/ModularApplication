package edu.kvcc.cis298.weigel.abstractions.module.controller.tasks;

import edu.kvcc.cis298.weigel.abstractions.controller.Controller;
import edu.kvcc.cis298.weigel.abstractions.module.Module;
import edu.kvcc.cis298.weigel.abstractions.application.ModuleLocator;
import edu.kvcc.cis298.weigel.abstractions.task.Task;


public
class InitializeModuleTask
	extends Task
{
	private ModuleLocator mModuleLocator;

	@Override
	public
	void setController( Controller controller )
	{

	}

	@Override
	public
	void initializeTask( ModuleLocator moduleLocator )
	{
		mModuleLocator = moduleLocator;
	}

	@Override
	public
	void startTask()
	{

		for( Module module : mModuleLocator.getModules())
		{
			module.initializeModule(mModuleLocator);
		}
	}

	@Override
	public
	void pauseTask()
	{
		// not yet implemented
	}

	@Override
	public
	void resumeTask()
	{
		// not yet implemented
	}

	@Override
	public
	void stopTask()
	{
		// not yet implemented
	}

	@Override
	public
	void destroyTask()
	{
		mModuleLocator = null;
	}
}
