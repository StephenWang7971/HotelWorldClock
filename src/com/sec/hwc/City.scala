package com.sec.hwc

import java.util.{Calendar, Date}

class City(n: String, tz: Int, dst: DaylightSavingTime) {

  val name: String = n;
  val timezone: Int = tz;
  val daylightSavingTime: DaylightSavingTime = dst;
  var time: Date = new Date();

  def correctTime(time: Date) {
    //println("==============================================");
    //println("CORRECT CITY TIME of " + name + " to " + time);
    var serverTime: Date = adjustTimeInverse(time);
    TimeServerObject.server.adjustTime(serverTime);
  }

  def adjustTimeInverse(t: Date): Date = {
    val calendar: Calendar = Calendar.getInstance();
    calendar.setTime(t);
    calendar.add(Calendar.HOUR, -timezone);
    return calendar.getTime;
  }

  def adjustTime(t: Date): Date = {
    val calendar: Calendar = Calendar.getInstance();
    calendar.setTime(t);
    calendar.add(Calendar.HOUR, timezone);
    return calendar.getTime;
  }

  def syncTime(serverTime: Date) {
    var t: Date = serverTime;
    if (daylightSavingTime != null) {
      t = daylightSavingTime.adjustTime(serverTime);
    }
    this.time = adjustTime(t);
    //println(this.name + " is now adjusted to : " + time);
  }

}
