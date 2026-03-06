import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArayList {
    public static void main (String[] args){

        //ArrayList = A resizeable array that stores objects (autoboxing)
        //            Arrays are fixed in size, but ArrayLists can change

//           ArrayList<String> fruits = new ArrayList<>();
//
//           fruits.add("Apple");
//           fruits.add("Banana");
//           fruits.add("Orange");
//           fruits.add("Mango");
//
//           fruits.remove(1);
//        fruits.remove("Orange");
//
//        fruits.set(1,"Apple");
//
//        System.out.println(fruits.get(3));
//        System.out.println(fruits.size());
//
//        Collections.sort(fruits);
//
//        System.out.println(fruits);

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter # of foods: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= n; i++){



                System.out.print("Enter food #" + i + ": ");
                String f= scanner.nextLine();

                 foods.add(f);



        }
        System.out.println(foods);

        scanner.close();



    }
}
