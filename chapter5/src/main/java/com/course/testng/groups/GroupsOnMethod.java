package com.course.testng.groups;

import org.testng.annotations.*;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法11111111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法11111111");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法3333333333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法44444444");
    }
    @BeforeGroups("server")
    public void beforegroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法！！！！！");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后运行的方法！！！！！");
    }

    @BeforeGroups("client")
    public void beforegroupsOnClient(){
        System.out.println("这是服务端组运行之前运行的方法！！！！！");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是服务端组运行之后运行的方法！！！！！");
    }
}
