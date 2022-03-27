package com.lemon.okHttp;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class OkHttpDemo {
    public static void main(String[] args) throws Exception {
        String url ="http://mail.qq.com/";
        //1.创建一个okHttpClient

        OkHttpClient client = new OkHttpClient();
        //2.构建请求reques
        Request request= new Request.Builder()
                .url(url)
                .get()
                .build();
        //3.使用client发送请求，返回一个响应对象
        Response response = client .newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.body().string());
    }
}
