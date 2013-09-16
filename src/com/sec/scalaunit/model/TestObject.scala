package com.sec.scalaunit.model

import java.util.Date

class TestObject(obj:Object) {

  val actual : Object = obj;

  def isEqualTo(expected : Object) {
    if (expected.isInstanceOf[Date] && actual.isInstanceOf[Date]) {
      val exp : Date = expected.asInstanceOf[Date];
      val act : Date = actual.asInstanceOf[Date];
      if (
        !exp.getYear.equals(act.getYear)
        || !exp.getMonth.equals(act.getMonth)
        || !exp.getDay.equals(act.getDay)
        || !exp.getHours.equals(act.getHours)
        || !exp.getMinutes.equals(act.getMinutes)
        || !exp.getSeconds.equals(act.getSeconds)
        || !exp.getTimezoneOffset.equals(act.getTimezoneOffset)
      ) {
        UnitLogger.error("[[[[[FAILED]]]]] expected " + expected.toString + ", but actual is " + actual.toString);
      }
      return;
    }
    if (actual.equals(expected)) {
      UnitLogger.error("[[[[[FAILED]]]]] expected " + expected.toString + ", but actual is " + actual.toString);
    }
  }
}
