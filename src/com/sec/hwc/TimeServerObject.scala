package com.sec.hwc

import java.util.Date
import java.text.SimpleDateFormat

object TimeServerObject {

  val beijing : City = new City("Beijing", 8, null);
  val london : City = new City("London", 0, new DaylightSavingTime(Util.getDate("03-31"), Util.getDate("10-27")));
  val newYork : City = new City("New York", -5, new DaylightSavingTime(Util.getDate("03-10"), Util.getDate("10-03")));
  val moscow : City = new City("Moscow", 4, null);
  val sydney : City = new City("Sydney", 10, null);
  val tokyo : City =  new City("Tokyo", 9, null);

  val server : TimeServer  = new TimeServer {
    var time: Date = new Date();
    val cities: List[City] = beijing::london::newYork::moscow::sydney::tokyo::Nil;
  }
}
