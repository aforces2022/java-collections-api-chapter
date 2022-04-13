package com.zorba.collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("1","abc");
        properties.setProperty("2","bcd");
        properties.setProperty("3","cde");

        System.out.println(properties);

        System.out.println(properties.getProperty("1"));
        System.out.println(properties.getProperty("3"));
        System.out.println(properties.getProperty("5"));
    }
}
