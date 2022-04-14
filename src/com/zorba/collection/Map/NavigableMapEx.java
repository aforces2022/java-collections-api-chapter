package com.zorba.collection.Map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapEx {
    public static void main(String[] args) {
        NavigableMap map = new TreeMap();
        map.put("b","ball");
        map.put("a","apple");
        map.put("c","cat");
        map.put("d","dog");

        System.out.println(map);
        System.out.println(map.ceilingEntry("c"));
        System.out.println(map.ceilingKey("c"));
        System.out.println(map.floorEntry("c"));
        System.out.println(map.floorKey("c"));
        System.out.println(map.higherEntry("c"));
        System.out.println(map.higherKey("c"));
        System.out.println(map.lowerEntry("c"));
        System.out.println(map.lowerKey("c"));

    }
}
