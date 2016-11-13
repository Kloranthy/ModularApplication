package edu.kvcc.cis298.weigel.abstractions.module.controller;

import edu.kvcc.cis298.weigel.abstractions.module.controller.ModuleController;
import edu.kvcc.cis298.weigel.abstractions.task.Task;
public abstract
class ModuleTask
	extends Task
{


	public
	ModuleTask(
		          String name, ModuleController controller
	          )
	{
		super( name,
		       controller );
	}

	@Override
	protected
	void onTaskSuccess()
	{

	}

	@Override
	protected
	void onTaskFailure()
	{

	}
}
