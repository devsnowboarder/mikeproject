//Java program to find the least frequent element
//in an array
package mikeprojects;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class leastFrequency {

 public static Integer leastFrequent(int arr[],int n)
    {

        // Insert all elements in hash.
        Map<Integer,Integer> count = new HashMap<Integer,Integer>();



        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            System.out.println(" Key " + key);

            if(count.containsKey(key))
            {
                int freq = count.get(key);
                freq++;
                count.put(key,freq);

            }
            else {
                count.put(key, 1);
                System.out.println(key + " "+ count.get(key));
            }
        }

        // find min frequency.
        int min_count = n+1, res = -1;
        for(Entry<Integer,Integer> val : count.entrySet())
        {
            if (min_count >= val.getValue())
            {
                res = val.getKey();
                min_count = val.getValue();
            }
        }

        return res;
    }

    // driver program
    public static void main (String[] args) {

        int arr[] = {1, 3, 2, 1, 2, 2, 3, 1};
        int n = arr.length;

        System.out.println(leastFrequent(arr,n));
    }
}