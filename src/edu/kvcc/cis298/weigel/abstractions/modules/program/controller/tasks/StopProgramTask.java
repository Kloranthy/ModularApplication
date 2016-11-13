package edu.kvcc.cis298.weigel.abstractions.modules.program.controller.tasks;

import edu.kvcc.cis298.weigel.abstractions.task.Task;

public abstract
class StopProgramTask
	extends Task
{
	public
	StopProgramTask(
		               ProgramController controller
	               )
	{
		super( "stop_program_task",
		       controller );
	}
}
