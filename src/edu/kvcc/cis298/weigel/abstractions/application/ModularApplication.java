package edu.kvcc.cis298.weigel.abstractions.application;

public
interface ModularApplication
{
	void startApplication();

	void initializeApplication();

	void pauseApplication();

	void resumeApplication();

	void stopApplication();

	void destroyApplication();
}
