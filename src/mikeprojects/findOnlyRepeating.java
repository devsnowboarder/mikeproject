package mikeprojects;

import java.util.*;

// Java program to find the only repeating
// element in an array where elements are
// from 1 to n-1.


class findOnlyRepeating {
    // Function to find repeted element
    static int findRepeating(int[] arr, int n) {
        int missingElement = 0;

        // indexing based
        for (int i = 0; i < n; i++) {

            int element = arr[Math.abs(arr[i])];


            if (element < 0) {
                missingElement = arr[i];
                break;
            }

            arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];

            //  System.out.println(arr[Math.abs(arr[i])]  +  "   "+arr[Math.abs(arr[i])]);


        }

        return Math.abs(missingElement);
    }


    public static void repeatNum ( int[] arr2) {


        ArrayList<String>  repNum = new ArrayList<>();

        for ( int x: arr2) {
            repNum.add(" "+x);

        }

        HashSet<String> num = new HashSet<>(repNum);

        for(String str: num)
            if ( Collections.frequency(repNum,str)  >1 )
                System.out.println(str);

    }
    // Driver code
    public static void main(String[] args) {
        Integer [] arr = {1, 4, 7, 3, 8, 7, 1, 6, 2, 5};

        Character []  charx =  {'x','b','c'};


        int n = arr.length;

        //  System.out.println(findRepeating(arr, n));


        int [] arr2 = {1, 4, 7, 3, 8, 7, 1, 6, 2, 5};

        List<Integer> numList =  Arrays.asList(arr);
        Character[] charList = charx;

        for ( Character x: charList)
            System.out.println(x);


        repeatNum(arr2);

        //  List<Integer> targetLIST = Arrays.asList(num);


/*


        Set<Integer> set = new HashSet<>(arr2);

        for ( int num : arr2 )
            if ( ! set.add(num)) {
                System.out.println(num + "  repeating number ");

            }


*/
    }
}