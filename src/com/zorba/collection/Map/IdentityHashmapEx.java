package com.zorba.collection.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashmapEx {
    public static void main(String[] args) {
        Map<Integer,String> map = new IdentityHashMap<>();

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        map.put(i1,"hi");
        map.put(i2,"hello");

        System.out.println(map);
        System.out.println(map.get(i1));
        System.out.println(map.get(i2));
        System.out.println(map.get(10));
    }
}
