package edu.kvcc.cis298.weigel.module;
public abstract class Module
{
	private String mName;
	protected ModuleLocator mModuleLocator;

	public Module( String name )
	{
		mName = name;
		mModuleLocator = ModuleLocator.getInstance();
	}

	public String getName()
	{
		return mName;
	}
}
