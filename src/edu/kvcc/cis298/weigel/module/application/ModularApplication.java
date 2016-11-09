package edu.kvcc.cis298.weigel.module.application;

import edu.kvcc.cis298.weigel.module.ModuleLocator;

public
interface ModularApplication
{
	public
	ModuleLocator getModuleLocator();

	public abstract
	void startApplication();

	public abstract
	void pauseApplication();

	public abstract
	void resumeApplication();

	public abstract
	void stopApplication();
}
