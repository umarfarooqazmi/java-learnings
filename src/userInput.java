import java.util.Scanner;
public class userInput {
    public static void main (String[] args){

       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: "); // using print will give inline
        String name = scanner.nextLine(); // .next doesn't read spaces .nextInt for int and .nextDouble for double and so on
        System.out.println("Hello "+ name );

        scanner.close();
    }

}
