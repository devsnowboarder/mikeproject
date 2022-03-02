package com.mikeprojects.Interface;




interface Sorting {
    void bubble(int array[] );
    void doInsertionSort2(int input[]) ;
    void doSelectionSort(int[] arr);
}


class BubbleSort implements Sorting {

    @Override
    public void doSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index])
                    index = j;
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        for ( int i=0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    @Override
    public void doInsertionSort2(int[] input) {

        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }

        for ( int i=0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }

    }


    public void bubble(int array[]) {

        System.out.println(" want to do bubble sort");
        int n = array.length;
        int k;
        int temp;


        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {

                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                    // swapNumbers(i, k, array);
                }
            }
        }
            //printNumbers(array);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");

        }

    }


}
public class SortingTest {
    public static void main(String[] args) {

        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        BubbleSort BS = new BubbleSort();
        BS.bubble( input);
        System.out.println();
        BS.doInsertionSort2(input);
        System.out.println();
        BS.doSelectionSort(input);

    }
}

