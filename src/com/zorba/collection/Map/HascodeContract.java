package com.zorba.collection.Map;

public class HascodeContract {
    public static void main(String[] args) {
        String s = "hello";
        String s1 ="hi";
        String s3 ="hello";

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s.equals(s1));
        System.out.println(s.equals(s3));

        //if .equals is true then hashcode will be true

        // if hashcode is false then .equals must be false
    }
}
