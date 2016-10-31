package edu.kvcc.cis298.weigel.implementations;
import edu.kvcc.cis298.weigel.TaskQueue;
import edu.kvcc.cis298.weigel.module.application.execution.ExecutionModule;
import edu.kvcc.cis298.weigel.task.Task;

public class SingleThreadedExecutionModule
	extends ExecutionModule
{
	private TaskQueue mTasks;

	public SingleThreadedExecutionModule()
	{
	}

	@Override
	public void executeTask( Task task )
	{
		task.init( mModuleLocator );
		task.run();
	}
}
