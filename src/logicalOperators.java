import java.sql.SQLOutput;
import java.util.Scanner;
public class logicalOperators {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // username must be betweeen 4-12 characters
        // username must not contain spaces or underscores

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username cannot contain spaces or underscores");
        }
        else{
            System.out.println("Hello " + username);
        }



        scanner.close();
    }
}
