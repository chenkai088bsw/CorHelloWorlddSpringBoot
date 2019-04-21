package com.atguigu;
import com.atguigu.bean.Person;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * SpringBoot的单元测试：
 * 可以在测试期间很方便的类似编码一样进行自动注入
 */
@RunWith(SpringRunner.class)    //使用测试使用Spring的驱动器来跑
@SpringBootTest     //这是一个SpringBoot的单元测试
public class SpringBoot02ConfigApplicationTests {
    @Autowired
    Person person;
    @Autowired
    ApplicationContext context;

    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads(){
        //日志的级别
        logger.trace("这个trace日志");
        logger.debug("这个debug信息");
        logger.info("这个info日志");
        logger.warn("这是warn信息");
        logger.error("这是Error信息");
        System.out.println(person.toString());
        System.out.println(context.containsBean("helloService"));
    }
}









