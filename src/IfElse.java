import  java.util.Scanner;
public class IfElse {
    public static void main(String[] args){

        // if statement = performs a block of cod if its condition is true

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(name.isEmpty()){
            System.out.println("Name is empty");
        }
        else{
            System.out.println("Hello "+ name + "!");
        }

        if(age>=65){
            System.out.println("You are a senior!");
        }
        else if(age>=18){
            System.out.println("You are an adult!");
        }
        else if (age == 0){
            System.out.println("You are a baby!");
        }
        else if(age < 0){
            System.out.println("You are not born yet!");
        }
        else{
            System.out.println("You are a child!");
        }

        scanner.close();
    }
}
