package com.logistics.util;

import java.text.DateFormat;
import java.util.Date;

public class CountTime {
	public String currentlyTimeString(){
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		return dateFormat.format(date);
	}
	public Date currentlyTime(){
		Date date = new Date();
		return date;
	}
}