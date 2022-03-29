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

        /*for (Integer i:list) {
            if(i%2==0){
                list.remove(i);
            }
        }*/
        //iterator
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()){
            Integer value = i.next();
            if(value%2 ==0){
                i.remove();
            }


        }
        System.out.println(list);
    }
}
