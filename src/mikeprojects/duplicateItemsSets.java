package mikeprojects;

import java.util.*;

public class duplicateItemsSets {

    public static void main(String[] args) {

        int[] listA = {1,3,4,5,6,1,3,4};
        int[] listB = {1,3,4,5,6,1,3,4};

        ArrayList<String> ListNum = new ArrayList<>();
        ArrayList<Integer> ListNumX = new ArrayList<>();

        Set<String> listINT = new HashSet<String>();
        Set<Integer> listINTX = new HashSet<Integer>();


        for ( int x=0; x < listA.length-1; x++) {
            System.out.println(listA[x]);
            ListNum.add(" "+listA[x]);

        }

        for ( String k: ListNum)
            if ( !listINT.add(k))
                System.out.println("duplicate "+ k);


        for ( int x=0; x < listB.length-1; x++) {
            System.out.println(listB[x]);
            ListNumX.add(listB[x]);

        }

        for ( Integer xx: ListNumX)
            if ( !listINTX.add(xx))
                System.out.println("duplicate "+ xx);


        System.out.println( ListNum);
        System.out.println(Collections.max(ListNumX));

        Integer KKK = Collections.max(ListNumX) - Collections.min(ListNumX);
        System.out.println(KKK);


    }
}
