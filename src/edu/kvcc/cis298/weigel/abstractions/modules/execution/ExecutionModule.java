package edu.kvcc.cis298.weigel.abstractions.modules.execution;

import edu.kvcc.cis298.weigel.abstractions.module.Module;
import edu.kvcc.cis298.weigel.abstractions.task.Task;

public abstract
class ExecutionModule
	extends Module
{
	public
	ExecutionModule()
	{
		super( "execution" );
	}

	public abstract
	void executeTask( Task task );
}
