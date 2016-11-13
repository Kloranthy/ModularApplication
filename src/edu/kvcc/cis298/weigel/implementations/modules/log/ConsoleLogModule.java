package edu.kvcc.cis298.weigel.implementations.modules.log;

import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
import edu.kvcc.cis298.weigel.abstractions.application.ModuleLocator;
import edu.kvcc.cis298.weigel.abstractions.modules.log.LogModule;

public
class ConsoleLogModule
	extends LogModule
{
	@Override
	public
	void log( String message )
	{
		System.out.println( message );
	}

	@Override
	public
	void log( Event event )
	{
		System.out.println( event.toString() );
	}

	@Override
	public
	void initializeModule( ModuleLocator moduleLocator )
	{

	}

	@Override
	public
	void startModule()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public
	void pauseModule()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public
	void resumeModule()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public
	void stopModule()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public
	void destroyModule()
	{
		// TODO Auto-generated method stub
	}
}
