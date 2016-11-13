package edu.kvcc.cis298.weigel.abstractions.application.controller.tasks;

import edu.kvcc.cis298.weigel.abstractions.application.controller.ApplicationController;
import edu.kvcc.cis298.weigel.abstractions.controller.Controller;
import edu.kvcc.cis298.weigel.abstractions.module.Module;
import edu.kvcc.cis298.weigel.abstractions.application.ModuleLocator;
import edu.kvcc.cis298.weigel.abstractions.task.Task;


public abstract
class InitializeApplicationTask
	extends Task
{
	private ModuleLocator mModuleLocator;

	public
	InitializeApplicationTask(
		                         String name,
		                         ApplicationController controller
	                         )
	{
		super( name,
		       controller );
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
	void destroyTask()
	{
		mModuleLocator = null;
	}
}
