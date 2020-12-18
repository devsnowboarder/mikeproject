package com.mikeproject.ArrayListSort;

import java.util.ArrayList;

public class ArraySortList {

    public static void main(String args[]) {
        useCollectionSortMethod objList = new useCollectionSortMethod();

        ArrayList<Integer> arr = new ArrayList<>();
     //   printArrayList ob2 = new printArrayList();

        int arr2[] = {64, 34, 25, 12, 22, 11, 90};

        for ( int i =0; i < arr2.length; i ++)
        {
            arr.add(arr2[i]);

        }

        int n = arr.size();

        objList.CollectionSortList(arr);
        objList.reverseCollectionSortList(arr);
       // System.out.println("Sorted array");
       // ob2.printArray(arr);
    }
}
