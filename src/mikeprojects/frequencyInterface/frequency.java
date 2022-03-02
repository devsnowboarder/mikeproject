package mikeprojects.frequencyInterface;
// need to fix this
import java.util.ArrayList;
import java.util.Collections;
//ArrayList<String> charList = new ArrayList<>();
interface Frequency {
    void frequency(ArrayList<Integer> array );

}


class FrequencyMike implements Frequency {

    public void frequency(ArrayList<Integer> array )  {

        for ( Integer i:array)
            System.out.println(i + " "+ Collections.frequency(array,i));

    }
}

public class frequency {

    public static void main(String[] args) {

        ArrayList<Integer>  numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(2);
        numList.add(10);
        numList.add(1);

        FrequencyMike FM = new FrequencyMike();
        FM.frequency(numList);

    }

}