package com.sec.scalaunit

import test.com.sec.hwc.TestTimeServer

object TestRunner {
  def main(arg:Array[String]) {
     //LookForTestCases();
    //Foreach
    //Eexcute..
    val target : TestTimeServer = new TestTimeServer();
    println("TestTimeServer[TestClass]");
    println("    testCommonDate[TestCase]");
    target.testCommonDate();
    println("    testCommonDate2[TestCase]");
    target.testCommonDate2();
    println("    testDaylightSavingTimeForLondon[TestCase]");
    target.testDaylightSavingTimeForLondon();
    println("    testDaylightSavingTime[TestCase]");
    target.testDaylightSavingTime();
  }
}
