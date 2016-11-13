package edu.kvcc.cis298.weigel.abstractions.controller;

public
abstract class State
{
	public abstract
	boolean canTransitionTo( State state );
}
