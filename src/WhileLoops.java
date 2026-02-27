import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number;
//        String response = "";
//
//        while(!response.equals("Q")){
//            System.out.println("You are playing a game!");
//            System.out.print("Press Q to Quit: ");
//            response = scanner.next().toUpperCase();
//        }
//
//        System.out.println("You Quit the Game");
//
      do{
          System.out.println("Enter a number betwen 1-10: ");
          number = scanner.nextInt();
      } while (number < 1 || number > 10);

        System.out.println("You picked "+number);


        scanner.close();
    }
}
