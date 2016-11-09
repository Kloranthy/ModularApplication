package edu.kvcc.cis298.weigel.module;

public abstract
class Module
{
	protected ModuleLocator
		mModuleLocator;
	private   String
		mName;
	private   ModuleState
		mState;

	public
	Module( String name )
	{
		mName
			= name;
		mModuleLocator
			= ModuleLocator.getInstance();
	}

	public
	String getName()
	{
		return mName;
	}

	public abstract
	void startModule();

	public abstract
	void pauseModule();

	public abstract
	void resumeModule();

	public abstract
	void stopModule();

	public abstract
	void destroyModule();
}
