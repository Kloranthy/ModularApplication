package edu.kvcc.cis298.weigel.abstractions.modules.program.controller.tasks;

import edu.kvcc.cis298.weigel.abstractions.application.ModuleLocator;
import edu.kvcc.cis298.weigel.abstractions.controller.Controller;
import edu.kvcc.cis298.weigel.abstractions.task.Task;

public abstract
class InitializeProgramTask
	extends Task
{
	// private variables
	private ModuleLocator
		mModuleLocator;

	public
	InitializeProgramTask(
		                     ProgramController controller
	                     )
	{
		super( "initialize_program_task",
		       controller );
	}

	// public methods
	@Override
	public
	void initializeTask( ModuleLocator moduleLocator )
	{
		mModuleLocator
			= moduleLocator;
	}
}
