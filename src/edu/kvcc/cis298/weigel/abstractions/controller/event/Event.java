package edu.kvcc.cis298.weigel.abstractions.controller.event;

public abstract
class Event
{
	private String mEventName;
	private String mSourceName;
	private String mTargetName;

	public Event(String eventName)
	{
		mEventName = eventName;
	}

	public
	String getEventName()
	{
		return mEventName;
	}

	public String getSourceName()
	{
		return mSourceName;
	}

	public String getTargetName()
	{
		return mTargetName;
	}

	public
	void setSourceName( String sourceName )
	{
		mSourceName
			= sourceName;
	}

	public
	void setTargetName( String targetName )
	{
		mTargetName
			= targetName;
	}
}
