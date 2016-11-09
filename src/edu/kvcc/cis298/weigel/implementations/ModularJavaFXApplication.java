package edu.kvcc.cis298.weigel.implementations;

import edu.kvcc.cis298.weigel.module.ModuleLocator;
import edu.kvcc.cis298.weigel.module.application.ApplicationController;
import edu.kvcc.cis298.weigel.module.application.ModularApplication;
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
				new InitializeEvent()
			                                  );
			// setup modules
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
		// start program
	}

	@Override
	public
	void stop()
		throws
		Exception
	{
		super.stop();
		// stop modules via execution module
	}

	@Override
	public
	ModuleLocator getModuleLocator()
	{
		return mModuleLocator.getInstance();
	}

	@Override
	public
	void startApplication()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public
	void pauseApplication()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public
	void resumeApplication()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public
	void stopApplication()
	{
		// TODO Auto-generated method stub
	}
}
