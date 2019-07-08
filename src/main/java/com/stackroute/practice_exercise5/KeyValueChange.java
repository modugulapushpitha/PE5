package com.stackroute.practice_exercise5;

import java.util.Map;

public class KeyValueChange {
    public Map<String,String> valueChange(Map<String,String> map){
        map.replace("val2",map.get("val1"));
        map.replace("val1"," ");
        return map;
    }
}
