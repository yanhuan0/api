package com.lemon.okHttp;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class OkHttpDemo2 {
    public static void main(String[] args) {
        String url="https://127.0.0.1/login";

        //创建OkHttpClient对象
        OkHttpClient client =new OkHttpClient();
        //创建RequestBody
        MediaType type = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(type,"username=admin");

    }

}
