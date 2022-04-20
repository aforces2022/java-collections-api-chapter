package com.zorba.collection.Map;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorex {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list);
        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()){
            String s = itr.next();
            if(s.equals("c")){
                itr.set("C");
            }
            if(s.equals("d")){
                itr.add("g");
            }
            //itr.hasPrevious();
            //itr.previous();
            if(s.equals("e")){
                while (itr.hasPrevious()){
                    itr.remove();
                }
            }
        }
        System.out.println(list);

        //
    }
}
