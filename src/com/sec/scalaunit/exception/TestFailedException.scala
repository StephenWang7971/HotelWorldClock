package com.sec.scalaunit.exception

//Throw when test failed.
class TestFailedException(exp: Object, act: Object, msg: String) extends Exception {
  var expected = exp;
  var actual = act;
  var message = msg;

  def hasValue(): Boolean = {
    return expected != null || actual != null;
  }

  def getExpected() : String =  {
    if (expected == null) {
      return "null";
    } else {
      return expected.toString;
    }
  }

  def getActual() : String = {
    if (actual == null) {
      return "null";
    } else {
      return actual.toString;
    }
  }
}
