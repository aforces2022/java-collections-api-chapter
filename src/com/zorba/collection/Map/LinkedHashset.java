package com.zorba.collection.Map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {
    public static void main(String[] args) {
/*        Set<String> sets = new LinkedHashSet<>();

        System.out.println(sets.add("abc"));
        System.out.println(sets.add("xyz"));
        System.out.println(sets.add("hi"));
        System.out.println(sets.add("hello"));
        System.out.println(sets.add("good"));
        System.out.println(sets.add("hi"));
        System.out.println(sets.add(null));
        System.out.println(sets.add(null));
        System.out.println(sets);*/


        Set<Employee> sets = new HashSet<>();
        Employee e1 = new Employee(1,"abc");
        Employee e2 = new Employee(2,"bcd");
        Employee e3 = new Employee(2,"bcd");
        sets.add(e1);
        sets.add(e2);
        sets.add(e3);

        System.out.println(e2.equals(e3));
        System.out.println(sets);

        //1,3,5,6,8,2



    }
}
