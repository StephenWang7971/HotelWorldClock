package com.sec.hwc

import java.util.{Calendar, Date}

class DaylightSavingTime (f : Date, t : Date) {
  val from : Date = f;
  val to : Date = t;

  def adjustTime(time : Date) : Date = {

    val calendar : Calendar = Calendar.getInstance();
    calendar.setTime(time);

    val fromCal : Calendar = Calendar.getInstance();
    fromCal.setTime(from);
    fromCal.set(Calendar.YEAR, calendar.get(Calendar.YEAR));

    val toCal : Calendar = Calendar.getInstance();
    toCal.setTime(to);
    toCal.set(Calendar.YEAR, calendar.get(Calendar.YEAR));

    if (time.after(fromCal.getTime()) && time.before(toCal.getTime())) {
      calendar.add(Calendar.HOUR, 1);
      return calendar.getTime();
    }
    return time;
  }
}
