package impl;

import service.DemoApi;

/**
 * @Author: liuguangzheng   rrefe@163.com
 * @Date: 2019/8/30
 */
public class DemoApiImpl implements DemoApi {
    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
