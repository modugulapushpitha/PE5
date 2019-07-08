package com.stackroute.practice_exercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListUpdate {
    ArrayList<String> list=new ArrayList<String>();
    public ArrayList<String> arraylist(String[] input,int[] index,String[] replace){
        for(int i=0;i<input.length;i++){
            list.add(input[i]);
        }
        if(index.length==replace.length) {
            for (int j = 0; j < index.length; j++) {
                list.set(index[j], replace[j]);
            }
        }
        else {
            return list;
        }
        return list;
    }
    public ArrayList<String> remove(){
        list.clear();
        return list;
    }
}
