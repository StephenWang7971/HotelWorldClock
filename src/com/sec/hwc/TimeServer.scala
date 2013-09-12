package com.sec.hwc

import java.util.Date

/**
 * Created with IntelliJ IDEA.
 * User: wanghongliang
 * Date: 13-9-12
 * Time: 上午8:29
 * To change this template use File | Settings | File Templates.
 */
abstract class TimeServer {
  val cities : List[City];
  var time : Date;

  def adjustTime(t : Date) {
    println("==========================================");
    println("Adjust server time to : " + t);
    time = t;
    notifyCities();
  }

  def notifyCities() {
    cities.foreach((city:City) => city.synchTime(time))
  }
}
