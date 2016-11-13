package edu.kvcc.cis298.weigel.abstractions.application.controller;

import edu.kvcc.cis298.weigel.abstractions.controller.Controller;
import edu.kvcc.cis298.weigel.abstractions.task.Task;
public abstract
class ApplicationTask
	extends Task
{
	public
	ApplicationTask(
		               String name,
		               Controller controller
	               )
	{
		super( name,
		       controller );
	}
}
