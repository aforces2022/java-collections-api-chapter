package com.zorba.collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapHashMapEx {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(10,"hello");
        map.put(12,"hey");
        map.put(13,"hi");
        map.put(12,"heyyy");

        System.out.println(map);
        System.out.println("get method   "+map.get(13));
        System.out.println("map is empty or not "+map.isEmpty());
        System.out.println("size :---- "+map.size());

        Set set = map.keySet();
        Set entrySet = map.entrySet();
        Collection c = map.values();

        for(Object o:set){
            System.out.println("key is "+ o+"  value is "+ map.get(o));
        }

        for(Object e : entrySet){
            Map.Entry entry = (Map.Entry) e;
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }


    }
}
