package mikeprojects;
import utility.charList;

import java.util.*;

public class duplicateitem2 {
    public static void main(String[] args) throws Exception {

        charList charList2 = new charList();


        char[]  charList = {'a','b','g','t','a','b'};

        List<String> list = new ArrayList<String>();

        List<String> listChar = new ArrayList<String>();

        for ( Character xCh : charList)
            listChar.add(" "+xCh);

        HashSet<String>  strList = new HashSet<>(listChar);


        for (String x: strList)
        {
            if (Collections.frequency(listChar,x) >1)
                System.out.println(x);
        }



        list.add("Ashok");
        list.add("Vinod");
        list.add("Kumar");
        list.add("Ashok");
        list.add("Mariyala");
        list.add("Venkata");
        list.add("Mariyala");
        list.add("Vinod");
        list.add("Ashok");
        list.add("Kumar");

        Map<String, Integer> duplicates = new HashMap<String, Integer>();


        for (String str : list) {
            if (duplicates.containsKey(str)) {
                duplicates.put(str, duplicates.get(str) + 1);
            } else {
                duplicates.put(str, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : duplicates.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


        HashSet<String> set =new HashSet<String>(list);

        for ( String x: list)
            System.out.println(x + "   "+Collections.frequency(list,x));


        HashSet setString = new HashSet<>(listChar);

        System.out.println(setString);

        for ( Object str: setString)
            System.out.println(str + "  x "+Collections.frequency(listChar,str));

        System.out.println(utility.charList.strList(charList));

    }



}
