package edu.kvcc.cis298.weigel.module.application;
import edu.kvcc.cis298.weigel.module.Module;

public abstract class ApplicationModule
	extends Module
{
	public ApplicationModule( String name )
	{
		super( name );
	}

	public abstract void start();

	public abstract void pause();

	public abstract void resume();

	public abstract void stop();
}
