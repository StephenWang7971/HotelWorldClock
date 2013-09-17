package test.com.sec.hwc

;

import java.util.Date
import com.sec.scalaunit.annotation.{Test, TestCase}
import com.sec.hwc.{Util, TimeServerObject}
import com.sec.scalaunit.assertion.ScalaUnit


@Test
class TestTimeServer extends ScalaUnit {

  @TestCase
  def testCommonDate() {
    TimeServerObject.server.adjustTime(Util.getTime("2013-01-13 00:00:00"));
    val beijingTime: Date = Util.getTime("2013-01-13 08:00:00");
    assertThat(TimeServerObject.beijing.time).isEqualTo(beijingTime);
    val londonTime: Date = Util.getTime("2013-01-13 00:00:00");
    assertThat(TimeServerObject.london.time).isEqualTo(londonTime);
  }

  @TestCase
  def testCommonDate2() {
    TimeServerObject.server.adjustTime(Util.getTime("2013-01-13 23:00:00"));
    val beijingTime: Date = Util.getTime("2013-01-14 07:00:00");
    assertThat(TimeServerObject.beijing.time).isEqualTo(beijingTime);
    val londonTime: Date = Util.getTime("2013-01-13 23:00:00");
    assertThat(TimeServerObject.london.time).isEqualTo(londonTime);
  }

  @TestCase
  def testDaylightSavingTimeForLondon() {
    TimeServerObject.server.adjustTime(Util.getTime("2013-03-31 00:00:01"));
    val beijingTime: Date = Util.getTime("2013-03-31 08:00:01");
    assertThat(TimeServerObject.beijing.time).isEqualTo(beijingTime);
    val londonTime: Date = Util.getTime("2013-03-31 01:00:01");
    assertThat(TimeServerObject.london.time).isEqualTo(londonTime);
  }

  @TestCase
  def testDaylightSavingTime() {
    TimeServerObject.server.adjustTime(Util.getTime("2013-04-16 00:00:01"));
    val beijingTime: Date = Util.getTime("2013-04-16 08:00:01");
    assertThat(TimeServerObject.beijing.time).isEqualTo(beijingTime);
    val londonTime: Date = Util.getTime("2013-04-16 01:00:01");
    assertThat(TimeServerObject.london.time).isEqualTo(londonTime);
  }
}
