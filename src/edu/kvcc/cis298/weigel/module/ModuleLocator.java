package edu.kvcc.cis298.weigel.module;

import java.util.HashMap;

/**
 * used to locate and retrieve modules
 * <p>
 * todo: change so that it checks application state, and if not
 * stopping or stopped, it loads the missing module with a
 * classloader/factory
 * <p>
 * todo: consider changing keys from string to class/interface
 *
 * @author Josh
 */
public
class ModuleLocator
{
	// private variables
	private static ModuleLocator
		mInstance;
	private        HashMap<String, Module>
		mModules;

	// private methods
	private
	ModuleLocator()
	{
		mModules
			= new HashMap<String, Module>();
	}

	// public methods
	public static
	ModuleLocator getInstance()
	{
		if ( mInstance
		     == null )
		{
			mInstance
				= new ModuleLocator();
		}
		return mInstance;
	}

	public
	void addModule( Module module )
	{
		String
			moduleName
			= module.getName();
		if ( hasModule( moduleName ) )
		{
			// TODO: add option on whether to replace
			// existing module or throw error
		}
		else
		{
			mModules.put(
				moduleName,
				module
			            );
		}
	}

	public
	boolean hasModule( String moduleName )
	{
		return mModules.containsKey( moduleName );
	}

	public
	Module getModule( String moduleName )
	{
		if ( hasModule( moduleName ) )
		{
			return mModules.get( moduleName );
		}
		return null;
	}

	public
	void removeModule( String moduleName )
	{
		if ( hasModule( moduleName ) )
		{
			Module
				module
				= mModules.remove( moduleName );
			module.destroyModule();
			// assert null ?
		}
	}
}
