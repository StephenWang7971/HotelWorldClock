package com.sec.hwc

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
