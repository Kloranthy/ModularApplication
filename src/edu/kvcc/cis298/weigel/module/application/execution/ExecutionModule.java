package edu.kvcc.cis298.weigel.module.application.execution;
import edu.kvcc.cis298.weigel.module.Module;
import edu.kvcc.cis298.weigel.task.Task;

public abstract class ExecutionModule
	extends Module
{
	public ExecutionModule()
	{
		super( "execution" );
	}

	public abstract void executeTask( Task task );
}
