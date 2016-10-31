package edu.kvcc.cis298.weigel.task;
import edu.kvcc.cis298.weigel.module.ModuleLocator;

public class InitProgramTask
	extends Task
{
	// private variables
	private ModuleLocator mModuleLocator;

	// public methods
	@Override
	public void init( ModuleLocator moduleLocator )
	{
		mModuleLocator = moduleLocator;
	}

	@Override
	public void run()
	{
	}

	@Override
	public String getType()
	{
		return this.getClass().getName().toString();
	}
}
