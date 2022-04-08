package com.zorba.collection.Map;

import java.util.*;

public class HashMapwithEqualHashcode {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"abc","M");
        Employee e2 = new Employee(1,"abc","M");

        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));

        Map<Employee,Integer> map = new HashMap<>();
        map.put(e1,1);
        map.put(e2,2);

        System.out.println(map);

        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
    }
}
