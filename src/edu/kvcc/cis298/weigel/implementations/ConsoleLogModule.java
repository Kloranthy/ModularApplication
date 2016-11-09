package edu.kvcc.cis298.weigel.implementations;

import edu.kvcc.cis298.weigel.event.Event;
import edu.kvcc.cis298.weigel.module.application.LogModule;

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
