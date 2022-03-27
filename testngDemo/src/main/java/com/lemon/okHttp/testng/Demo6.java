package com.lemon.okHttp.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

public class Demo6 {

//    @Test(dataProvider="datas")
//    public void test1(String fn,String ln){
//        System.out.println(fn + "." + ln);
//    }
//
//    @DataProvider(name="datas")
//    public Object[][] datas(){
//        Object[][] datas={
//                {"尼古拉斯","赵四"},
//                {"亚历山大","翠花"}
//        };
//        return datas;
//    }


    @Test(dataProvider = "data")
    public void print(String name){
        System.out.println(name);
    }

    @DataProvider(name="data")
    public Object[][] data(){
        Object[][] res = {
                {"YAN"},
                {"HUAN"}
        };
        return res;
    }
}

