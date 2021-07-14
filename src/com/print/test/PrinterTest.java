/** 

* @author LI 
* @version 创建时间：2021年7月12日 下午7:54:15 
* package:com.print.test
* 类说明 

*/ 
package com.print.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.print.printer.Printer;

public class PrinterTest {

	@Test
	public void testPrinter() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过Printer bean的id来获取Printer实例
        Printer printer = (Printer)context.getBean("printer");
        String content = "几位轻量级容器的作者曾骄傲地对我说：这些容器非常有"
                + "用，因为它们实现了“控制反转”。这样的说辞让我深感迷惑：控"
                + "制反转是框架所共有的特征，如果仅仅因为使用了控制反转就认为"
                + "这些轻量级容器与众不同，就好像在说“我的轿车是与众不同的，" + "因为它有4个轮子。”";
        printer.print(content);
	}

}
