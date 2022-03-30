package com.zorba.collection.Map;

import java.util.*;

public class Hashsetex {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        //sets.add("hi");


        System.out.println(sets.add("123"));
        System.out.println(sets.toString());

        System.out.println(sets.add("abc"));
        System.out.println(sets.add("xyz"));
        System.out.println(sets.add("hi"));
        System.out.println(sets.add("hello"));
        System.out.println(sets.add("good"));
        System.out.println(sets.add("hi"));
        System.out.println(sets.add(null));
        System.out.println(sets.add(null));
        System.out.println(sets);

        Iterator<String> i = sets.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }



    }
}
