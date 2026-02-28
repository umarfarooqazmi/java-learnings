import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) throws InterruptedException{

        //for loop = execute some code a certain amount of times
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count down seconds: ");
        int seconds = scanner.nextInt();

        for(int i = seconds; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Hello");

         scanner.close();
    }
}
