package com.stackroute.practice_exercise5;

import java.util.HashMap;
import java.util.Map;

public class MapCount {
    public Map<String,Integer> stringCount(String input){
        Map<String,Integer> map=new HashMap<String, Integer>();
        String[] array=input.split("[\\W_]+");
        for(String i:array){
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

       return map;
    }
}
