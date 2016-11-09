package edu.kvcc.cis298.weigel.task;

import java.util.LinkedList;

public
class TaskQueue
{
	private LinkedList<Task>
		mTasks;

	public
	TaskQueue()
	{
		mTasks
			= new LinkedList<Task>();
	}

	public
	TaskQueue( LinkedList<Task> tasks )
	{
		mTasks
			= tasks;
	}

	public
	boolean submitTask( Task task )
	{
		return mTasks.offer( task );
	}

	public
	boolean isEmpty()
	{
		return mTasks.isEmpty();
	}

	public
	Task requestTask()
	{
		if ( mTasks.isEmpty() )
		{
			// log and event
			return null;
		}
		return mTasks.getFirst();
	}
}
