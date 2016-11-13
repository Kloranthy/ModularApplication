package edu.kvcc.cis298.weigel.implementations.noticonnect.model;

import java.sql.Time;
public
class Notification
{
	private int
		mNotificationId;
	private String
		mNotificationTitle;
	private String
		mNotificationMessage;
	private
	Time
		mNotificationTime;

	public
	Notification( int notificationId )
	{
		mNotificationId
			= notificationId;
	}

	public
	void setNotificationTitle( String notificationTitle )
	{
		mNotificationTitle
			= notificationTitle;
	}

	public
	void setNotificationTime( Time notificationTime )
	{
		mNotificationTime
			= notificationTime;
	}

	public
	void setNotificationMessage( String notificationMessage )
	{
		mNotificationMessage
			= notificationMessage;
	}

	public
	int getNotificationId()
	{
		return mNotificationId;
	}

	public
	String getNotificationTitle()
	{
		return mNotificationTitle;
	}

	public
	String getNotificationMessage()
	{
		return mNotificationMessage;
	}

	public
	Time getNotificationTime()
	{
		return mNotificationTime;
	}

}
