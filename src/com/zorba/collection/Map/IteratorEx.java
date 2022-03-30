package com.zorba.collection.Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(i);
            if(i%2==0){
                iterator.remove();
            }
        }
        System.out.println(list);

       /* for(Integer i : list){
            if(i%2==0){
                list.remove(i);
            }
        }
        System.out.println(list);*/

       /* *//*for (Integer i:list) {
            if(i%2==0){
                list.remove(i);
            }
        }*//*
        //iterator
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()){
            Integer value = i.next();
            if(value%2 ==0){
                i.remove();
            }


        }
        System.out.println(list);*/
    }
}
