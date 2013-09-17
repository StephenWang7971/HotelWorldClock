package com.sec.scalaunit.assertion

import com.sec.scalaunit.exception.TestFailedException

class ScalaUnit {
  def assertThat(obj: Object): TestObject = {
    return new TestObject(obj);
  }

  def fail(msg: String) {
    throw new TestFailedException(null, null, msg);
  }
}
