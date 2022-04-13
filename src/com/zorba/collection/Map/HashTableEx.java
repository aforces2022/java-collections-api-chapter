package com.zorba.collection.Map;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("hi", "hello");
        table.put("hey","morning");
        //table.put(null,"hi");

        System.out.println(table);
    }
}
