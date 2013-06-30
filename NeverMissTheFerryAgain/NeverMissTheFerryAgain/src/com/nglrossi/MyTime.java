package com.nglrossi;

import android.text.format.Time;

public class MyTime {

	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;

	public int second;
	public int minute;
	public int hour;
	public int weekDay;

	public MyTime() {
		// TODO Auto-generated constructor stub
	}

	public MyTime(int second, int minute, int hour, int weekDay) {
		set(second, minute, hour, weekDay);
		// TODO Auto-generated constructor stub
	}

	public void set(int second2, int minute2, int hour2, int weekDay2) {
		second = second2;
		minute = minute2;
		hour = hour2;
		weekDay = weekDay2;
	}

	public void setToNow() {
		Time theRealNow = new Time();
		theRealNow.setToNow();
		set(theRealNow.second, theRealNow.minute, theRealNow.hour,
				theRealNow.weekDay);
	}

	public static boolean after(MyTime theTime) {
		// TODO
		return true;
	}

	public static boolean before(MyTime theTime) {
		// TODO
		return true;
	}

	public long toMillis(boolean ignoreDst) {
		// adding month and year adding the current ones, might need to review
		// for DST but not a biggie right now
		Time theRealNow = new Time();
		Time tempNow = new Time();
		tempNow.setToNow();
		theRealNow.set(second, minute, hour, tempNow.monthDay, tempNow.month,
				tempNow.year);
		return theRealNow.toMillis(ignoreDst);
	}

}
