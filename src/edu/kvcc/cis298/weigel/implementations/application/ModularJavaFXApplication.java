package edu.kvcc.cis298.weigel.implementations.application;

import edu.kvcc.cis298.weigel.abstractions.application.controller.ApplicationController;
import edu.kvcc.cis298.weigel.abstractions.application.controller.events.command.*;
import edu.kvcc.cis298.weigel.abstractions.application.controller.events.result.ApplicationCreatedEvent;
import edu.kvcc.cis298.weigel.abstractions.modules.log.LogModule;
import edu.kvcc.cis298.weigel.abstractions.controller.event.Event;
import edu.kvcc.cis298.weigel.abstractions.application.ModularApplication;
import edu.kvcc.cis298.weigel.abstractions.application.ModuleLocator;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * todo: abstract ModularApplication as an interface and have this
 * class implement it.
 *
 * @author Josh
 */
public
class ModularJavaFXApplication
	extends Application
	implements ModularApplication
{
	private ModuleLocator
		mModuleLocator;
	private ApplicationController
		mApplicationController;
	private
	LogModule mLogModule;

	public
	ModularJavaFXApplication()
	{
		mModuleLocator = ModuleLocator.getInstance();
		mLogModule = (LogModule) mModuleLocator.getModule("log");
		//mApplicationController
		//	= new ApplicationController();
		mApplicationController.handleEvent( new ApplicationCreatedEvent() );
	}

	public static
	void main( String[] args )
	{
		launch( args );
	}

	@Override
	public
	void init()
		throws
		Exception
	{
		super.init();
		try
		{
			mApplicationController.handleEvent(
				new InitializeApplicationEvent()
			                                  );
		}
		catch ( Exception exception )
		{
			// log for now, exception handler later
		}
	}

	@Override
	public
	void start( Stage primaryStage )
		throws
		Exception
	{
		// JavaFX GUI Stuff
		// start application modules
		mApplicationController.handleEvent(
			new StartApplicationEvent()
		                                  );
	}

	@Override
	public
	void stop()
		throws
		Exception
	{
		Event
			event
			= new StopApplicationEvent();
		mApplicationController.handleEvent( event );
	}

	@Override
	public
	void startApplication()
	{
		Event
			event
			= new StartApplicationEvent();
		mApplicationController.handleEvent( event );
	}

	@Override
	public
	void initializeApplication()
	{
		Event
			event
			= new InitializeApplicationEvent();
		mApplicationController.handleEvent( event );
	}

	@Override
	public
	void pauseApplication()
	{
		Event
			event
			= new PauseApplicationEvent();
		mApplicationController.handleEvent( event );
	}

	@Override
	public
	void resumeApplication()
	{

		Event
			event
			= new ResumeApplicationEvent();
		mApplicationController.handleEvent( event );
	}

	@Override
	public
	void stopApplication()
	{
		Event
			event
			= new StopApplicationEvent();
		mApplicationController.handleEvent( event );
	}

	@Override
	public
	void destroyApplication()
	{
		Event
			event
			= new DestroyApplicationEvent();
		mApplicationController.handleEvent( event );
	}
}
