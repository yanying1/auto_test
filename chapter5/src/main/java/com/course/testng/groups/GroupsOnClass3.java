package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1111111运行");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher22222222运行");
    }
}
