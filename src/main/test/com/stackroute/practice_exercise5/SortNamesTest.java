package com.stackroute.practice_exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortNamesTest {
    SortNames testobj;
    @Before
    public void setUp(){
        testobj=new SortNames();
    }
    @After
    public void tearDown(){
        testobj=null;
    }
    @Test
    public void testSortElements(){
        ArrayList<String> result=testobj.sortElements("Harry Olive Alice Bluto Eugene");
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        assertEquals(expected,result);
    }
    @Test
    public void testIntegerElementsSort(){
        ArrayList<String> result=testobj.sortElements("9 3 6 2 0");
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("0");
        expected.add("2");
        expected.add("3");
        expected.add("6");
        expected.add("9");
        assertEquals(expected,result);
    }
    @Test
    public void testSpecialCharactersSort(){
        ArrayList<String> result=testobj.sortElements("@ # $ % & *");
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("#");
        expected.add("$");
        expected.add("%");
        expected.add("&");
        expected.add("*");
        expected.add("@");
        assertEquals(expected,result);
    }

}