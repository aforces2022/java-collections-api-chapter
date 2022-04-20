package com.zorba.collection.Map;

import java.util.*;

public class HashMapwithEqualHashcode {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"abc","M");
        Employee e2 = new Employee(1,"abc","M");
        Employee e3 = new Employee(2,"abc","F");

        Map<Integer,Employee> map = new HashMap<>();
        map.put(e1.getId(),e1);
        map.put(e2.getId(),e2);
        map.put(e3.getId(),e3);

        for(Map.Entry<Integer,Employee> entry: map.entrySet()){
            Employee e = entry.getValue();
            if("M".equals(e.getGender())){
                System.out.println(e);
            }
        }

        /*System.out.println(e1==e2);
        System.out.println(e1.equals(e2));

        Map<Employee,Integer> map = new HashMap<>();
        map.put(e1,1);
        map.put(e2,2);

        System.out.println(map);

        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);*/
    }
}
