package com.mikeprojects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class frequency {
    public static void main(String[] args) {

        String str = "This is a test Hello world";
       // Integer[] num =[1,3,4,6,1,4,6,9,12];


        char[] charStr = str.toCharArray();

        ArrayList<String> charList = new ArrayList<>();

        for (char x : charStr)
            charList.add(" "+x);

        HashSet<String> strSet = new HashSet<>(charList);
       // HashSet<Integer> numSet = new HashSet<Integer>(num);

        for ( String x2: strSet)
            System.out.println(x2+ " "+ Collections.frequency(charList,x2));

    }
}
