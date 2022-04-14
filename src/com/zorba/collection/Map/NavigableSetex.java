package com.zorba.collection.Map;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetex {
    public static void main(String[] args) {
        NavigableSet set = new TreeSet();
        set.add(10);
        set.add(40);
        set.add(30);
        set.add(20);
        set.add(50);
        set.add(60);

        System.out.println(set);
        System.out.println(set.ceiling(30));
        System.out.println(set.higher(30));
        System.out.println(set.floor(40));
        System.out.println(set.lower(40));
        set.pollFirst();
        set.pollLast();
        System.out.println(set);
        System.out.println(set.descendingSet());
    }
}
