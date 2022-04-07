package com.zorba.collection.Map;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        String name="rajesh shrestha";

        char[] chars = name.toCharArray();

        Map<Character,Integer> nameMap = new HashMap<>();

        for(char c :chars){

            if(nameMap.containsKey(c)){
                nameMap.put(c,nameMap.get(c)+1);
            }else{
                nameMap.put(c,1);
            }
        }

        //System.out.println(nameMap);

        Set<Character> keys = nameMap.keySet();

        for(Character c: keys){
            System.out.println("key : "+ c+"  value: "+nameMap.get(c));
        }



        for(Map.Entry<Character,Integer> entry: nameMap.entrySet()){

            System.out.println(entry.getKey()+" ----"+entry.getValue());
        }

        Collection<Integer> integerList =nameMap.values();


    }

}
