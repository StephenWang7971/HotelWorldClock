package com.sec.scalaunit.model

class ScalaUnit {
  def assertThat(obj : Object) : TestObject = {
    return new TestObject(obj);
  }
}
