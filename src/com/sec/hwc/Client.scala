package com.sec.hwc

import java.util.Date
import java.text.SimpleDateFormat

/**
 * Created with IntelliJ IDEA.
 * User: wanghongliang
 * Date: 13-9-12
 * Time: 上午8:35
 * To change this template use File | Settings | File Templates.
 */
object Client {

  def main(args:Array[String]) {

    TimeServerObject.server.adjustTime(TimeServerObject.getTime("2013-01-13 00:00"));
    TimeServerObject.server.adjustTime(TimeServerObject.getTime("2013-01-13 09:00"));
    TimeServerObject.server.adjustTime(TimeServerObject.getTime("2013-01-13 21:00"));
    TimeServerObject.beijing.correctTime(TimeServerObject.getTime("2013-01-13 15:00"));

    TimeServerObject.server.adjustTime(TimeServerObject.getTime("2013-04-16 00:00"));
    TimeServerObject.server.adjustTime(TimeServerObject.getTime("2013-04-16 09:00"));
    TimeServerObject.server.adjustTime(TimeServerObject.getTime("2013-04-16 21:00"));
    TimeServerObject.beijing.correctTime(TimeServerObject.getTime("2013-04-16 15:00"));
  }
}
