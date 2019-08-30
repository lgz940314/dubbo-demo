package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DemoApi;

import java.io.IOException;

/**
 * @Author: liuguangzheng   rrefe@163.com
 * @Date: 2019/8/30
 */
public class ConsumerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });
        context.start();

        DemoApi demoApi = (DemoApi) context.getBean("demoApi");
        System.out.println(demoApi.sayHello());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

