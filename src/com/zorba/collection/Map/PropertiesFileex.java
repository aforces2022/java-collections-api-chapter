package com.zorba.collection.Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesFileex {
    public static void main(String[] args) throws IOException {

        Properties ps = new Properties();
        FileInputStream fis = new FileInputStream("/Users/adityapradhan/Desktop/class/chapter/gitcollection/config.properties");
        ps.load(fis);
        System.out.println(ps);
        ps.setProperty("api.token5","3439248792384793847");

        Enumeration e = ps.propertyNames();

        while (e.hasMoreElements()){
            String s = (String) e.nextElement();
            System.out.println(s +"-----"+ps.getProperty(s));
        }

        FileOutputStream fos = new FileOutputStream("/Users/adityapradhan/Desktop/class/chapter/gitcollection/config.properties");
        ps.store(fos,"new value 2 added");
    }
}
