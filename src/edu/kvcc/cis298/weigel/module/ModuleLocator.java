package edu.kvcc.cis298.weigel.module;
import java.util.HashMap;
import edu.kvcc.cis298.weigel.module.application.ApplicationModule;
import edu.kvcc.cis298.weigel.module.program.ProgramModule;

/**
 * used to locate and retrieve modules
 * 
 * todo: change so that it checks application state, and
 * if not stopping or stopped, it loads the missing module
 * with a classloader/factory
 * 
 * todo: consider changing keys from string to class/interface
 * 
 * 
 * @author Josh
 *
 */
public class ModuleLocator
{
	// private variables
	private static ModuleLocator mInstance;
	private HashMap<String, ApplicationModule> mApplicationModules;
	private HashMap<String, ProgramModule> mProgramModules;

	// public methods
	public static ModuleLocator getInstance()
	{
		if( mInstance == null )
		{
			mInstance = new ModuleLocator();
		}
		return mInstance;
	}

	public boolean hasApplicationModule( String moduleName )
	{
		return mApplicationModules.containsKey( moduleName );
	}

	public boolean hasProgramModule( String moduleName )
	{
		return mProgramModules.containsKey( moduleName );
	}

	public ApplicationModule getApplicationModule( String moduleName )
	{
		if( hasApplicationModule( moduleName ) )
		{
			return mApplicationModules.get( moduleName );
		}
		return null;
	}

	public ProgramModule getProgramModule( String moduleName )
	{
		if( hasProgramModule( moduleName ) )
		{
			return mProgramModules.get( moduleName );
		}
		return null;
	}

	// private methods
	private ModuleLocator()
	{
		mApplicationModules = new HashMap<String, ApplicationModule>();
		mProgramModules = new HashMap<String, ProgramModule>();
	}
}
