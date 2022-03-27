package com.lemon.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

public class Demo6 {

    @Test(dataProvider="datas")
    public void test1(String fn,String ln){
        System.out.println(fn + "." + ln);
    }

    @DataProvider(name="datas")
    public Object[][] datas(){
        Object[][] datas={
                {"尼古拉斯","赵四"},
                {"亚历山大","翠花"}
        };
        return datas;
    }
}
