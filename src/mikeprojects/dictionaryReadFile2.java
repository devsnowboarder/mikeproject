package mikeprojects;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class dictionaryReadFile2 {



    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new FileReader("/Volumes/mike_tc_one/mike_albums/49ers/49ers.html")));

        ArrayList<String> wordList = new ArrayList<>();

        String inputLine = null;
        int count = 1;

        // hash table does not have repeated item.

        while ((inputLine = reader.readLine()) != null) {

            inputLine = inputLine.replaceAll("@","'");
            System.out.println(inputLine);
        }
    }
}

