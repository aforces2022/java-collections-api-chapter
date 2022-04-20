package com.zorba.collection.Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFileEx2 {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("/Users/adityapradhan/Desktop/class/chapter/gitcollection/config.properties");
        p.load(fis);
        System.out.println(p);

        p.setProperty("db.username","admin");
        p.setProperty("db.password","admin@123");

        FileOutputStream fos = new FileOutputStream("/Users/adityapradhan/Desktop/class/chapter/gitcollection/config2.properties");
        p.store(fos,"any comments");
    }
}
