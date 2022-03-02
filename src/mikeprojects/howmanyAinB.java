package mikeprojects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class howmanyAinB {
    public static void main(String[] args) {
        int[] listA = {1, 3, 4, 6, 7, 9,4,6};
        int[] listB = {1, 2, 4, 5, 6, 2,};


        Set<Integer> listINTX = new HashSet<Integer>();

        ArrayList<Integer> dubNum =new ArrayList<Integer>();


        for (int x : listB)
            listINTX.add(x);

        for (int y: listA)
            if ( !listINTX.add(y))
              dubNum.add(y);
            
   System.out.println(dubNum);

   HashSet<Integer> nondum = new HashSet<>(dubNum);

   for( Integer x: nondum )
         System.out.println( x + "  "+Collections.frequency(dubNum,x));

    }

}
