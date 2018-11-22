package com.gxf.log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @Author: <guanxianseng@163.com>
 * @Description:
 * @Date: Created in : 2018/11/21 5:05 PM
 **/
public class Log4jDemo2 {
  private static Logger logger = LogManager.getLogger(Log4jDemo2.class.getName());

  public static void main(String[] args)
  {
    while(true){
      logger.entry();   //trace级别的信息，单独列出来是希望你在某个方法或者程序逻辑开始的时候调用，和logger.trace("entry")基本一个意思
      logger.error("Did it again!");   //error级别的信息，参数就是你输出的信息
      logger.info("我是info信息");    //info级别的信息
      logger.debug("我是debug信息");
      logger.warn("我是warn信息");
      logger.fatal("我是fatal信息");
      logger.log(Level.DEBUG, "我是debug信息");   //这个就是制定Level类型的调用：谁闲着没事调用这个，也不一定哦！
      logger.exit();    //和entry()对应的结束方法，和logger.trace("exit");一个意思
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
