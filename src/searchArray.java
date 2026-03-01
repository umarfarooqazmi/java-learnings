import java.util.Scanner;

public class searchArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] fruits = { "apple", "orange", "banana", "grapes" };
        String target;
        boolean isFound = false;

        System.out.print("Enter the target fruit: ");
        target = scanner.nextLine();

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                isFound = true;
                System.out.println("Element is found at: "+ i);
            }
        }
        if(!isFound){
            System.out.println("No such fruit found");
        }


        scanner.close();
    }
}
