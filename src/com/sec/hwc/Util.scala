package com.sec.hwc

import java.util.Date
import java.text.SimpleDateFormat

object Util {
  def getDate(date : String ) : Date = {
    val sdf : SimpleDateFormat  = new SimpleDateFormat("MM-dd");
    return sdf.parse(date);
  }

  def getTime(date : String ) : Date = {
    val sdf : SimpleDateFormat  = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    return sdf.parse(date);
  }
}
