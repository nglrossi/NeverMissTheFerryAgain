package com.nglrossi.mysecondapp;

import java.util.LinkedList;
import com.nglrossi.MyTime;

public class FerryTime {

	public static final int TOCIRCULARQUAY = 0;
	public static final int TOMANLY = 1;

	private final LinkedList<MyTime> timeTableToCircularQuay = new LinkedList<MyTime>();
	private final LinkedList<MyTime> timeTableToManly = new LinkedList<MyTime>();

	public FerryTime() {

		// build the list in reverse order

		// To Circular Quay
		for (int d = MyTime.SATURDAY; d >= MyTime.SUNDAY; d--) {
			switch (d) {
			case MyTime.MONDAY:
				timeTableToCircularQuay.add(new MyTime(0, 40, 23, d));
				timeTableToCircularQuay.add(new MyTime(0, 00, 23, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 22, d));
				timeTableToCircularQuay.add(new MyTime(0, 30, 21, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 20, d));
				timeTableToCircularQuay.add(new MyTime(0, 5, 20, d));
				timeTableToCircularQuay.add(new MyTime(0, 30, 19, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 19, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 18, d));
				timeTableToCircularQuay.add(new MyTime(0, 10, 18, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 17, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 17, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 16, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 16, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 15, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 15, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 14, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 14, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 13, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 13, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 12, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 12, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 11, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 11, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 10, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 10, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 9, d));
				timeTableToCircularQuay.add(new MyTime(0, 20, 9, d));
				timeTableToCircularQuay.add(new MyTime(0, 50, 8, d));
				timeTableToCircularQuay.add(new MyTime(0, 20, 8, d));
				timeTableToCircularQuay.add(new MyTime(0, 00, 8, d));
				timeTableToCircularQuay.add(new MyTime(0, 30, 7, d));
				timeTableToCircularQuay.add(new MyTime(0, 00, 7, d));
				timeTableToCircularQuay.add(new MyTime(0, 35, 6, d));
				timeTableToCircularQuay.add(new MyTime(0, 10, 6, d));
				break;
			case MyTime.TUESDAY:
			case MyTime.WEDNESDAY:
			case MyTime.THURSDAY:
			case MyTime.FRIDAY:
				timeTableToCircularQuay.add(new MyTime(0, 40, 23, d));
				timeTableToCircularQuay.add(new MyTime(0, 00, 23, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 22, d));
				timeTableToCircularQuay.add(new MyTime(0, 30, 21, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 20, d));
				timeTableToCircularQuay.add(new MyTime(0, 5, 20, d));
				timeTableToCircularQuay.add(new MyTime(0, 30, 19, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 19, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 18, d));
				timeTableToCircularQuay.add(new MyTime(0, 10, 18, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 17, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 17, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 16, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 16, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 15, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 15, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 14, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 14, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 13, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 13, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 12, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 12, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 11, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 11, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 10, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 10, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 9, d));
				timeTableToCircularQuay.add(new MyTime(0, 20, 9, d));
				timeTableToCircularQuay.add(new MyTime(0, 50, 8, d));
				timeTableToCircularQuay.add(new MyTime(0, 20, 8, d));
				timeTableToCircularQuay.add(new MyTime(0, 00, 8, d));
				timeTableToCircularQuay.add(new MyTime(0, 30, 7, d));
				timeTableToCircularQuay.add(new MyTime(0, 00, 7, d));
				timeTableToCircularQuay.add(new MyTime(0, 35, 6, d));
				timeTableToCircularQuay.add(new MyTime(0, 10, 6, d));
				timeTableToCircularQuay.add(new MyTime(0, 20, 00, d));
				break;
			case MyTime.SATURDAY:
				timeTableToCircularQuay.add(new MyTime(0, 40, 23, d));
				timeTableToCircularQuay.add(new MyTime(0, 00, 23, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 22, d));
				timeTableToCircularQuay.add(new MyTime(0, 30, 21, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 20, d));
				timeTableToCircularQuay.add(new MyTime(0, 5, 20, d));
				timeTableToCircularQuay.add(new MyTime(0, 30, 19, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 19, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 18, d));
				timeTableToCircularQuay.add(new MyTime(0, 10, 18, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 17, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 17, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 16, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 16, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 15, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 15, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 14, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 14, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 13, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 13, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 12, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 12, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 11, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 11, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 10, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 10, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 9, d));
				timeTableToCircularQuay.add(new MyTime(0, 20, 9, d));
				timeTableToCircularQuay.add(new MyTime(0, 50, 8, d));
				timeTableToCircularQuay.add(new MyTime(0, 20, 8, d));
				timeTableToCircularQuay.add(new MyTime(0, 00, 8, d));
				timeTableToCircularQuay.add(new MyTime(0, 30, 7, d));
				timeTableToCircularQuay.add(new MyTime(0, 00, 7, d));
				timeTableToCircularQuay.add(new MyTime(0, 35, 6, d));
				timeTableToCircularQuay.add(new MyTime(0, 55, 00, d));
				timeTableToCircularQuay.add(new MyTime(0, 20, 00, d));
				break;
			case MyTime.SUNDAY:
				timeTableToCircularQuay.add(new MyTime(0, 40, 23, d));
				timeTableToCircularQuay.add(new MyTime(0, 00, 23, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 22, d));
				timeTableToCircularQuay.add(new MyTime(0, 30, 21, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 20, d));
				timeTableToCircularQuay.add(new MyTime(0, 5, 20, d));
				timeTableToCircularQuay.add(new MyTime(0, 30, 19, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 19, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 18, d));
				timeTableToCircularQuay.add(new MyTime(0, 10, 18, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 17, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 17, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 16, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 16, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 15, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 15, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 14, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 14, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 13, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 13, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 12, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 12, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 11, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 11, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 10, d));
				timeTableToCircularQuay.add(new MyTime(0, 15, 10, d));
				timeTableToCircularQuay.add(new MyTime(0, 45, 9, d));
				timeTableToCircularQuay.add(new MyTime(0, 20, 9, d));
				timeTableToCircularQuay.add(new MyTime(0, 50, 8, d));
				timeTableToCircularQuay.add(new MyTime(0, 20, 8, d));
				timeTableToCircularQuay.add(new MyTime(0, 00, 8, d));
				timeTableToCircularQuay.add(new MyTime(0, 30, 7, d));
				timeTableToCircularQuay.add(new MyTime(0, 55, 00, d));
				timeTableToCircularQuay.add(new MyTime(0, 20, 00, d));
				break;
			}
		}

		// To Manly
		for (int d = MyTime.SATURDAY; d >= MyTime.SUNDAY; d--) {
			switch (d) {
			case MyTime.MONDAY:
			case MyTime.TUESDAY:
			case MyTime.WEDNESDAY:
			case MyTime.THURSDAY:
			case MyTime.FRIDAY:
				timeTableToManly.add(new MyTime(0, 45, 23, d));
				timeTableToManly.add(new MyTime(0, 00, 23, d));
				timeTableToManly.add(new MyTime(0, 15, 22, d));
				timeTableToManly.add(new MyTime(0, 30, 21, d));
				timeTableToManly.add(new MyTime(0, 45, 20, d));
				timeTableToManly.add(new MyTime(0, 55, 19, d));
				timeTableToManly.add(new MyTime(0, 25, 19, d));
				timeTableToManly.add(new MyTime(0, 50, 18, d));
				timeTableToManly.add(new MyTime(0, 30, 18, d));
				timeTableToManly.add(new MyTime(0, 00, 18, d));
				timeTableToManly.add(new MyTime(0, 30, 17, d));
				timeTableToManly.add(new MyTime(0, 00, 17, d));
				timeTableToManly.add(new MyTime(0, 30, 16, d));
				timeTableToManly.add(new MyTime(0, 00, 16, d));
				timeTableToManly.add(new MyTime(0, 30, 15, d));
				timeTableToManly.add(new MyTime(0, 00, 15, d));
				timeTableToManly.add(new MyTime(0, 30, 14, d));
				timeTableToManly.add(new MyTime(0, 00, 14, d));
				timeTableToManly.add(new MyTime(0, 30, 13, d));
				timeTableToManly.add(new MyTime(0, 00, 13, d));
				timeTableToManly.add(new MyTime(0, 30, 12, d));
				timeTableToManly.add(new MyTime(0, 00, 12, d));
				timeTableToManly.add(new MyTime(0, 30, 11, d));
				timeTableToManly.add(new MyTime(0, 00, 11, d));
				timeTableToManly.add(new MyTime(0, 30, 10, d));
				timeTableToManly.add(new MyTime(0, 00, 10, d));
				timeTableToManly.add(new MyTime(0, 30, 9, d));
				timeTableToManly.add(new MyTime(0, 00, 9, d));
				timeTableToManly.add(new MyTime(0, 40, 8, d));
				timeTableToManly.add(new MyTime(0, 10, 8, d));
				timeTableToManly.add(new MyTime(0, 40, 7, d));
				timeTableToManly.add(new MyTime(0, 15, 7, d));
				timeTableToManly.add(new MyTime(0, 50, 6, d));
				timeTableToManly.add(new MyTime(0, 20, 6, d));
				timeTableToManly.add(new MyTime(0, 30, 5, d));
				break;
			case MyTime.SATURDAY:
				timeTableToManly.add(new MyTime(0, 45, 23, d));
				timeTableToManly.add(new MyTime(0, 00, 23, d));
				timeTableToManly.add(new MyTime(0, 15, 22, d));
				timeTableToManly.add(new MyTime(0, 30, 21, d));
				timeTableToManly.add(new MyTime(0, 45, 20, d));
				timeTableToManly.add(new MyTime(0, 55, 19, d));
				timeTableToManly.add(new MyTime(0, 25, 19, d));
				timeTableToManly.add(new MyTime(0, 50, 18, d));
				timeTableToManly.add(new MyTime(0, 30, 18, d));
				timeTableToManly.add(new MyTime(0, 00, 18, d));
				timeTableToManly.add(new MyTime(0, 30, 17, d));
				timeTableToManly.add(new MyTime(0, 00, 17, d));
				timeTableToManly.add(new MyTime(0, 30, 16, d));
				timeTableToManly.add(new MyTime(0, 00, 16, d));
				timeTableToManly.add(new MyTime(0, 30, 15, d));
				timeTableToManly.add(new MyTime(0, 00, 15, d));
				timeTableToManly.add(new MyTime(0, 30, 14, d));
				timeTableToManly.add(new MyTime(0, 00, 14, d));
				timeTableToManly.add(new MyTime(0, 30, 13, d));
				timeTableToManly.add(new MyTime(0, 00, 13, d));
				timeTableToManly.add(new MyTime(0, 30, 12, d));
				timeTableToManly.add(new MyTime(0, 00, 12, d));
				timeTableToManly.add(new MyTime(0, 30, 11, d));
				timeTableToManly.add(new MyTime(0, 00, 11, d));
				timeTableToManly.add(new MyTime(0, 30, 10, d));
				timeTableToManly.add(new MyTime(0, 00, 10, d));
				timeTableToManly.add(new MyTime(0, 30, 9, d));
				timeTableToManly.add(new MyTime(0, 00, 9, d));
				timeTableToManly.add(new MyTime(0, 40, 8, d));
				timeTableToManly.add(new MyTime(0, 10, 8, d));
				timeTableToManly.add(new MyTime(0, 40, 7, d));
				timeTableToManly.add(new MyTime(0, 15, 7, d));
				timeTableToManly.add(new MyTime(0, 50, 6, d));
				timeTableToManly.add(new MyTime(0, 20, 6, d));
				timeTableToManly.add(new MyTime(0, 20, 00, d));
				break;
			case MyTime.SUNDAY:
				timeTableToManly.add(new MyTime(0, 00, 23, d));
				timeTableToManly.add(new MyTime(0, 15, 22, d));
				timeTableToManly.add(new MyTime(0, 30, 21, d));
				timeTableToManly.add(new MyTime(0, 45, 20, d));
				timeTableToManly.add(new MyTime(0, 55, 19, d));
				timeTableToManly.add(new MyTime(0, 25, 19, d));
				timeTableToManly.add(new MyTime(0, 50, 18, d));
				timeTableToManly.add(new MyTime(0, 30, 18, d));
				timeTableToManly.add(new MyTime(0, 00, 18, d));
				timeTableToManly.add(new MyTime(0, 30, 17, d));
				timeTableToManly.add(new MyTime(0, 00, 17, d));
				timeTableToManly.add(new MyTime(0, 30, 16, d));
				timeTableToManly.add(new MyTime(0, 00, 16, d));
				timeTableToManly.add(new MyTime(0, 30, 15, d));
				timeTableToManly.add(new MyTime(0, 00, 15, d));
				timeTableToManly.add(new MyTime(0, 30, 14, d));
				timeTableToManly.add(new MyTime(0, 00, 14, d));
				timeTableToManly.add(new MyTime(0, 30, 13, d));
				timeTableToManly.add(new MyTime(0, 00, 13, d));
				timeTableToManly.add(new MyTime(0, 30, 12, d));
				timeTableToManly.add(new MyTime(0, 00, 12, d));
				timeTableToManly.add(new MyTime(0, 30, 11, d));
				timeTableToManly.add(new MyTime(0, 00, 11, d));
				timeTableToManly.add(new MyTime(0, 30, 10, d));
				timeTableToManly.add(new MyTime(0, 00, 10, d));
				timeTableToManly.add(new MyTime(0, 30, 9, d));
				timeTableToManly.add(new MyTime(0, 00, 9, d));
				timeTableToManly.add(new MyTime(0, 40, 8, d));
				timeTableToManly.add(new MyTime(0, 10, 8, d));
				timeTableToManly.add(new MyTime(0, 40, 7, d));
				timeTableToManly.add(new MyTime(0, 15, 7, d));
				timeTableToManly.add(new MyTime(0, 50, 6, d));
				timeTableToManly.add(new MyTime(0, 20, 00, d));
				break;
			}
		}
	}

	private MyTime getNextFerry(MyTime whatTime, int direction) {
		// private method used in either direction
		// used to avoid code duplication

		int second = 0;
		int minute = 0;
		int hour = 0;
		int weekDay = 0;

		LinkedList<MyTime> timeTable;
		if (direction == TOCIRCULARQUAY)
			timeTable = timeTableToCircularQuay;
		else
			timeTable = timeTableToManly;

		// loop on the timetable once to get the first ferry on the next day
		// first
		// if the days match, the loop will keep assigning the time found to the
		// local variables
		// until the first ferry of the day is in there
		// TODO looks pretty inefficient
		for (MyTime d : timeTable) {
			if (whatTime.weekDay + 1 == d.weekDay
					|| ((d.weekDay == MyTime.SUNDAY) && (whatTime.weekDay == MyTime.SATURDAY))) {
				// if the day after the one I am looking for, I check the last
				// ferry and save it, in case that's the one
				weekDay = d.weekDay;
				hour = d.hour;
				minute = d.minute;
				second = d.second;
			}
		}

		// another loop, now I check one by one the ferries on the same day,
		// starting from the last one if the current ferry is not in the past, I
		// will assign it to the local variables and keep going when I find one
		// in the past I just ignore it and exit
		boolean foundIt = false;
		for (MyTime d : timeTable) {
			if (whatTime.weekDay == d.weekDay && !foundIt) {
				// check the hour, if it's in the past exit, else analyze
				// further
				if (whatTime.hour > d.hour) {
					// the ferry in the timetable is in the past, just exit from
					// everything
					foundIt = true;
					continue;
				} else if (whatTime.hour < d.hour) {
					// this one is in the future, lets save it and keep going
					// with the loop
					// to see if there is another one
					weekDay = d.weekDay;
					hour = d.hour;
					minute = d.minute;
					second = d.second;
				} else {
					// same hour, could be the one but need to analyze further
					if (whatTime.minute > d.minute) {
						// the ferry in the timetable is in the past, just exit
						// from everything
						foundIt = true;
						continue;
					} else if (whatTime.minute < d.minute) {
						// this one is in the future, lets save it and keep
						// going with the loop
						// to see if there is another one
						weekDay = d.weekDay;
						hour = d.hour;
						minute = d.minute;
						second = d.second;
					} else {
						// same minute, could be the one but need to analyze
						// further
						if (whatTime.second > d.second) {
							// the ferry in the timetable is in the past, just
							// exit from everything
							foundIt = true;
							continue;
						} else {
							// this is the one, and it's just a few seconds
							// away..
							weekDay = d.weekDay;
							hour = d.hour;
							minute = d.minute;
							second = d.second;
							foundIt = true;
							continue;
						}
					}
				}
			}
		}
		return new MyTime(second, minute, hour, weekDay);

	}

	public MyTime getNextFerryToCircularQuayByTime(MyTime whatTime) {
		return getNextFerry(whatTime, TOCIRCULARQUAY);
	}

	public MyTime getNextFerryToManly(MyTime whatTime) {
		return getNextFerry(whatTime, TOMANLY);
	}

	private String countDown(MyTime whatTime, int direction) {
		MyTime ferryTime;
		if (direction == TOCIRCULARQUAY)
			ferryTime = getNextFerryToCircularQuayByTime(whatTime);
		else
			ferryTime = getNextFerryToManly(whatTime);

		long hrs, min, sec;
		long tmpsec = 0;

		// check if the ferry is on the same day or add hours
		if (ferryTime.weekDay >= whatTime.weekDay) {
			tmpsec = ferryTime.toSeconds(false) - whatTime.toSeconds(false);
		} else {
			// I assume the Ferry is on the next day, but if new featureas are
			// added to the app, I might have to review this method for a ferry
			// in the future
			tmpsec = (ferryTime.toSeconds(false) + (60 * 60 * 24 * 7))
					- whatTime.toSeconds(false);
		}

		// convert back to hh:mm:ss
		hrs = tmpsec / 3600;
		min = (tmpsec % 3600) / 60;
		sec = tmpsec % 60;

		// string
		String str = "";

		// hours (show only if !=0)
		if (hrs > 0) {
			if (hrs < 10) str = str + "0";
			str = str + Long.toString(hrs) + ":";
		}

		// minutes
		if (min < 10)
			str = str + "0";
		str = str + Long.toString(min) + ":";

		// seconds
		if (sec < 10)
			str = str + "0";
		str = str + Long.toString(sec);

		return str;

		// String debug = "";
		// debug = debug + Integer.toString(theTime.hour) + ":";
		// debug = debug + Integer.toString(theTime.minute) + ":";
		// debug = debug + Integer.toString(theTime.second) + " - ";
		// debug = debug + Integer.toString(theTime.weekDay);
		// return debug;
	}

	public String countDownToCircularQuay(MyTime whatTime) {
		return countDown(whatTime, TOCIRCULARQUAY);
	}

	public String countDownToManly(MyTime whatTime) {
		return countDown(whatTime, TOMANLY);
	}
}