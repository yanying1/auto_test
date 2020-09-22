package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行啦");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite运行啦");
    }
    @BeforeTest
    public void Beforetest(){
        System.out.println("before test运行啦");

    }
    @AfterTest
    public void AfterTest(){
        System.out.println("after test运行啦");

    }
}
