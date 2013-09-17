package com.sec.hwc

object Client {

  def main(args: Array[String]) {

    TimeServerObject.server.adjustTime(Util.getTime("2013-01-13 00:00:00"));
    TimeServerObject.server.adjustTime(Util.getTime("2013-01-13 09:00:00"));
    TimeServerObject.server.adjustTime(Util.getTime("2013-01-13 21:00:00"));
    TimeServerObject.beijing.correctTime(Util.getTime("2013-01-13 15:00:00"));

    TimeServerObject.server.adjustTime(Util.getTime("2013-03-30 23:00:00"));
    TimeServerObject.server.adjustTime(Util.getTime("2013-03-31 03:00:00"));
    TimeServerObject.server.adjustTime(Util.getTime("2013-03-09 21:00:00"));
    TimeServerObject.server.adjustTime(Util.getTime("2013-03-10 01:00:00"));
    TimeServerObject.beijing.correctTime(Util.getTime("2013-03-10 5:00:00"));

    TimeServerObject.server.adjustTime(Util.getTime("2013-04-16 00:00:00"));
    TimeServerObject.server.adjustTime(Util.getTime("2013-04-16 09:00:00"));
    TimeServerObject.server.adjustTime(Util.getTime("2013-04-16 21:00:00"));
    TimeServerObject.beijing.correctTime(Util.getTime("2013-04-16 15:00:00"));
  }
}
