package com.zorba.collection.Map;

import java.util.*;

public class SetRevEx {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(10);
        integerList.add(15);
        integerList.add(30);
        integerList.add(70);

        System.out.println(integerList);

        Set<Integer> integerSet = new LinkedHashSet<>();
        //10,20 ,30, 15
        int count =0;
        for (Integer i:integerList) {
            if(!integerSet.add(i)){
                count++;  //1 2
            }
        }

        System.out.println(count);
        System.out.println(integerSet);

        String s = "hi hello good morning";

        Set<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        for (char c: ch) {
            set.add(c);
        }
        System.out.println(set);


        List<String> strings = new ArrayList<>();
        strings.add("ram");
        strings.add("shyam");
        strings.add("hari");
        strings.add("laxman");
        strings.add("ram");
        strings.add("shyam");

        Set nameset = new TreeSet();
       // Set nameset = new TreeSet(strings);

        for(String name: strings){
            nameset.add(name);
        }

        System.out.println(nameset);



    }
}
