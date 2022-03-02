package mikeprojects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class WordsinStrings {

    public static void main(String[] args) {

        String city = "San Francisco California";


        String[] wordList = city.split(" ");

        List<String> cityList2 = new ArrayList<>();


        System.out.println(wordList[1]);

        int wordCount=0;

        for ( String word:wordList) {
            wordCount = wordCount + 1;

        }


        System.out.println("wordCount " + wordCount);
        System.out.println(wordList.length);
    }

}
