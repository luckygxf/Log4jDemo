package com.gxf.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

/**
 * @Author: <guanxianseng@163.com>
 * @Description:
 * @Date: Created in : 2018/11/22 11:44 AM
 **/
public class MarkerLogger {
  public static void main(String[] args) {
    while(true){
      Logger logger = LogManager.getLogger(MarkerLogger.class);
      String username = "root";
      String password = "123456";
      Marker marker = MarkerManager.getMarker("test");
      logger.info(marker, "username:{} password:{}", username, password);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
