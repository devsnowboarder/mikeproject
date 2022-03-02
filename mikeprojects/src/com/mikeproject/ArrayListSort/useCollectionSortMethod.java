package com.mikeproject.ArrayListSort;

import java.util.ArrayList;
import java.util.Collections;

public class useCollectionSortMethod {

    void CollectionSortList(ArrayList<Integer> arr) {

        Collections.sort(arr);
        System.out.println(arr);
    }


    void reverseCollectionSortList (ArrayList<Integer>arr) {
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);

    }
}
