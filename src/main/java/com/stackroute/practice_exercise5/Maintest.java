package com.stackroute.practice_exercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Maintest {
    public static String sorter(ArrayList<Student> students) {


        Comparator<Student> comparator = new StudentSorter();
        Collections.sort(students,comparator);

        return students.toString();
    }
}
