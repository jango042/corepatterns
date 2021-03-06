package com.jango.corepatterns.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class HttpClient {
    private String method;
    private String url;
    private String userName;
    private String password;
    private String headers;
    private String body;


    public HttpClient(HttpClientBuilder httpClientBuilder) {
        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.userName = httpClientBuilder.userName;
        this.password = httpClientBuilder.password;
        this.headers = httpClientBuilder.headers;
        this.body = httpClientBuilder.body;
    }

    public static class HttpClientBuilder {
        private String method;
        private String url;
        private String userName;
        private String password;
        private String headers;
        private String body;

        public HttpClientBuilder method(String method) {
            this.method = method;
            return this;
        }
        public HttpClientBuilder url(String url) {
            this.url = url;
            return this;
        }
        public HttpClientBuilder secure(String userName, String password) {
            this.userName = userName;
            this.password = password;
            return this;
        }
        public HttpClientBuilder headers(String headers) {
            this.headers = headers;
            return this;
        }
        public HttpClientBuilder body(String body) {
            this.body = body;
            return this;
        }

        public HttpClient build() {
            return new HttpClient(this);
        }
    }
}
