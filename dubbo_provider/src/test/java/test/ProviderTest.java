package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DemoApi;

import java.io.IOException;

/**
 * @Author: liuguangzheng   rrefe@163.com
 * @Date: 2019/8/30
 */
public class ProviderTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();
        System.out.println("Dubbo provider is start.....");
        try {
            System.in.read();   // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}