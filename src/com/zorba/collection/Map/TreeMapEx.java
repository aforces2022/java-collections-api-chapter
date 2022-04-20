package com.zorba.collection.Map;

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("f");
        set.add("h");
        set.add("i");
        System.out.println(set);
        System.out.println(set.comparator());

        TreeMap<String,String> map = new TreeMap<>(new DescStringComp());
        map.put("c","C");
        map.put("a","A");
        map.put("b","B");
        map.put("h","H");
        map.put("d","D");
        map.put("l","L");
        map.put("m","M");

        System.out.println(map);
        //System.out.println(map.comparator());

       Map<StringBuilder, Integer> map1 = new TreeMap<>(new SBCOmparater());
        map1.put(new StringBuilder("hi"),1);
        System.out.println(map1);




    }
}
