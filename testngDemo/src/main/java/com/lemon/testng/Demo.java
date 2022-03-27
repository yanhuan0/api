package com.lemon.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.AccessibleObject;

public class Demo {

    //依赖，要运行test1需要先运行test2;alwaysRun设置为true时，有报错也会运行；description：说明，自己注解用
    @Test(dependsOnMethods = "test2",alwaysRun = true,description = "test1...")
    public void test1(){
        System.out.println("Demo ... test1...");

        //注解类 期望值和实际值
//        Assert.assertEquals(false,true);

    }
    @Test
    public void test2(){
        System.out.println("Demo ... test2...");
//        Assert.assertEquals(false,true);

    }

    //设置为false时失效
    @Test(enabled = false)
    public void test3(){
        System.out.println("Demo ... test3...");
    }
}
