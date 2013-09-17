package com.sec.scalaunit.assertion

import java.util.Date
import com.sec.scalaunit.exception.TestFailedException

class TestObject(obj: Object) {

  val actual: Object = obj;

  def isNull() {
    if (actual != null) {
      throw new TestFailedException(null, actual, "");
    }
  }

  def isNotNull() {
    if (actual == null) {
      throw new TestFailedException(null, actual, "");
    }
  }

  def isTrue() {
    if (actual == false) {
      throw new TestFailedException(null, actual, "");
    }
  }

  def isFalse() {
    if (actual == true) {
      throw new TestFailedException(null, actual, "");
    }
  }

  def isEqualTo(expected: Object) {
    if (expected.isInstanceOf[Date] && actual.isInstanceOf[Date]) {
      compareDateObject(expected)
      return;
    }
    if (actual.equals(expected)) {
      throw new TestFailedException(expected, actual, "");
    }
  }

  def compareDateObject(expected: Object) {
    val exp: Date = expected.asInstanceOf[Date];
    val act: Date = actual.asInstanceOf[Date];
    if (!exp.getYear.equals(act.getYear)
      || !exp.getMonth.equals(act.getMonth)
      || !exp.getDay.equals(act.getDay)
      || !exp.getHours.equals(act.getHours)
      || !exp.getMinutes.equals(act.getMinutes)
      || !exp.getSeconds.equals(act.getSeconds)
      || !exp.getTimezoneOffset.equals(act.getTimezoneOffset)
    ) {
      throw new TestFailedException(expected, actual, "");
    }
  }
}
