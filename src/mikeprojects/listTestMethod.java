
package mikeprojects;
import java.util.ArrayList;



    public class listTestMethod {


        public static ArrayList<String>   carList(ArrayList<String> carxList) {

            System.out.println(carxList);

            return carxList;

        };
        public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
             carList(cars);
             System.out.println(cars.get(2));


        }
    }

