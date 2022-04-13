package com.zorba.collection.Map;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchEx {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("B");
        l.add("M");
        l.add("K");
        l.add("a");
        System.out.println("before sorting :"+l);
        Collections.sort(l);
        System.out.println("after  sorting :"+l);
        System.out.println(Collections.binarySearch(l,"A"));
        System.out.println(Collections.binarySearch(l,"a"));
        System.out.println(Collections.binarySearch(l,"L"));
        System.out.println(Collections.binarySearch(l,"H"));
        System.out.println(Collections.binarySearch(l,"z"));
        System.out.println(Collections.binarySearch(l,"q"));





    }
}
