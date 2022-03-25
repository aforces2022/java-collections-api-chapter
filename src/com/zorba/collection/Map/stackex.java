package com.zorba.collection.Map;

import java.util.Stack;

public class stackex {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println(s);
        //remove the top
        System.out.println(s.pop());
        System.out.println(s);
        //return the top
        System.out.println(s.peek());
        System.out.println(s);
        //return the size
        System.out.println(s.size());

        //return the position from the top
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));

        String name = "hello";
        char[] c = name.toCharArray();

        Stack<Character> namestack = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            namestack.push(c[i]);
        }

        System.out.println(namestack);

        String rev="";
        StringBuilder sb = new StringBuilder();
        while (!namestack.isEmpty()){
            Character el = namestack.pop();
            //rev = rev+el;
            sb.append(el);
        }
        //System.out.println(rev);
        System.out.println(sb.toString());
        //new String(sb);


    }
}
