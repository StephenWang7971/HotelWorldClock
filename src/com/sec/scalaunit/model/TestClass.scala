package com.sec.scalaunit.model

import java.lang.reflect.Method
import test.com.sec.hwc.TestTimeServer

abstract class TestClass {
  val name : String;
  var methods: List[TestMethod];

  def setUp() {

  }

  def run(method: TestMethod) {
    val clazz: Class[_] = Class.forName(name);
    val instance = clazz.newInstance();
    val m: Method = clazz.getDeclaredMethod(method.name);
    m.invoke(instance);
  }

  def tearDown() {

  }
}
