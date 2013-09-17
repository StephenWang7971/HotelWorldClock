package com.sec.hwc

import java.util.Date

abstract class TimeServer {
  val cities: List[City];
  var time: Date;

  def adjustTime(t: Date) {
    //println("==========================================");
    //println("Adjust server time to : " + t);
    time = t;
    notifyCities();
  }

  def notifyCities() {
    cities.foreach((city: City) => city.syncTime(time))
  }
}
