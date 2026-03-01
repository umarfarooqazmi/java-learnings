import java.util.Scanner;

public class inputArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("Enter the # of foods: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }


        scanner.close();
    }
}
