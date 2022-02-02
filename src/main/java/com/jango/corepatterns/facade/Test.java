package com.jango.corepatterns.facade;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) {

        OrderFacade facade = new OrderFacade();
        facade.processOrder("MacBook", 3);
    }
}
