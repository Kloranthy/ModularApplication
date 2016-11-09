package edu.kvcc.cis298.weigel.task;

import edu.kvcc.cis298.weigel.module.ModuleLocator;

public abstract
class Task
{
	public abstract
	void initializeTask( ModuleLocator moduleLocator );

	public abstract
	void run();

	public
	String getType()
	{
		return this
			       .getClass()
			       .getName()
			       .toString();
	}
}
