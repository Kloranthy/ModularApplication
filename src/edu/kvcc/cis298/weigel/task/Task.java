package edu.kvcc.cis298.weigel.task;
import edu.kvcc.cis298.weigel.module.ModuleLocator;

public abstract class Task
	implements Runnable
{
	@Override
	public abstract void run();

	public abstract void init( ModuleLocator moduleLocator );

	public abstract String getType();
}
