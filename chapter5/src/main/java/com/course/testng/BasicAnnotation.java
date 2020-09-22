package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
//    最基本的主机，用来把方法标记成测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试方法2");
    }
    @BeforeMethod
    public void beforeMethon(){
        System.out.println("BeforeMethon这是在测试方法之前运行");
    }

    @AfterMethod
    public void AfterMethon(){
        System.out.println("AfterMethon这是测试方法之后运行的方法");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeclass这是在类运行之前运行的方法");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("afterclass这是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite这是测试套件");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite这是测试套件");
    }
}
