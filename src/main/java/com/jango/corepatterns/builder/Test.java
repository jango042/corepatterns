package com.jango.corepatterns.builder;

import static com.jango.corepatterns.builder.HttpClient.HttpClientBuilder;

public class Test {
    public static void main(String[] args) {
        HttpClient client = new HttpClient.HttpClientBuilder().method("POST")
                .url("http:/google.com").body("{}").build();
        System.out.println(client);
    }
}
