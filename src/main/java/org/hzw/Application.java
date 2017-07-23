package org.hzw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    MessagePrinter messagePrinter = context.getBean("messagePrinter", MessagePrinter.class);
    messagePrinter.printMessage();
  }
}
