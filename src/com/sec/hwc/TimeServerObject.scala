package com.sec.hwc

import java.util.Date
import java.text.SimpleDateFormat

/**
 * Created with IntelliJ IDEA.
 * User: wanghongliang
 * Date: 13-9-12
 * Time: 上午9:19
 * To change this template use File | Settings | File Templates.
 */
object TimeServerObject {

  def getDate(date : String ) : Date = {
    val sdf : SimpleDateFormat  = new SimpleDateFormat("MM-dd");
    return sdf.parse(date);
  }

  def getTime(date : String ) : Date = {
    val sdf : SimpleDateFormat  = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    return sdf.parse(date);
  }

  val beijing : City = new City("Beijing", 8, null);
  val london : City = new City("London", 0, new DaylightSavingTime(getDate("03-31"), getDate("10-27")));
  val newYork : City = new City("New York", -5, new DaylightSavingTime(getDate("03-10"), getDate("10-03")));
  val moscow : City = new City("Moscow", 4, null);
  val sydney : City = new City("Sydney", 10, null);
  val tokyo : City =  new City("Tokyo", 9, null);

  val server : TimeServer  = new TimeServer {
    var time: Date = new Date();
    val cities: List[City] = beijing::london::newYork::moscow::sydney::tokyo::Nil;
  }
}
