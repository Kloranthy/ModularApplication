package edu.kvcc.cis298.weigel.abstractions.application.controller.tasks;

import edu.kvcc.cis298.weigel.abstractions.application.ModuleLocator;
import edu.kvcc.cis298.weigel.abstractions.application.controller.ApplicationController;
import edu.kvcc.cis298.weigel.abstractions.controller.Controller;
import edu.kvcc.cis298.weigel.abstractions.task.Task;
public abstract
class DestroyApplicationTask
	extends Task
{
	public
	DestroyApplicationTask(
		                      String name,
		                      ApplicationController controller
	                      )
	{
		super( "destroy_application_task", // check format
		       controller );
	}
}
