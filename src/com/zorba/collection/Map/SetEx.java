package com.zorba.collection.Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        String name = "aditya pradhan";
        char[] ch = name.toCharArray();
        Set<Character> sets = new HashSet<>();
        int count =0;
        for (char c:ch) {
            if(!sets.add(c)){
                count++;
            }
        }
        System.out.println(count);

        /*List<Character> list = new ArrayList<>();
        int count =0;
        for (char c: ch) {
            if(list.contains(c)){
                count++;
            }else{
                list.add(c);
            }
        }
        System.out.println(list);
        System.out.println(count);*/
    }
}
