package com.stackroute.practice_exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringArrayCountTest {
    StringArrayCount testobj;
    @Before
    public void setUp(){
        testobj=new StringArrayCount();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void testArrayCount(){
        Map<String,Boolean> result=testobj.countArray(new String[]{"a","b","c","d","a","c","c"});
        Map<String,Boolean> map=new HashMap<String, Boolean>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        assertEquals(map,result);

    }

}