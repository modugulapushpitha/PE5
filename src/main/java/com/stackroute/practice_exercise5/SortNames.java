package com.stackroute.practice_exercise5;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortNames {
    public ArrayList<String> sortElements(String input){
        TreeSet<String> treeSet=new TreeSet<String>();
        String[] array=input.split(" ");
        for(int i=0;i<array.length;i++){
            treeSet.add(array[i]);
        }
    ArrayList<String> list=new ArrayList<String>(treeSet);
        return list;
    }
}
