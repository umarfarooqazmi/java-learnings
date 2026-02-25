import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args){

        // Shopping Cart
        Scanner scanner =new Scanner(System.in);
        String item;
        int quantity;
        double price;
        char currency= '$';
        double total;
        System.out.print("Enter the item name: ");
        item = scanner.nextLine();
        System.out.print("Enter the quantity: ");
        quantity =scanner.nextInt();
        System.out.print("Enter the price: ");
        price = scanner.nextDouble();

        total = price * quantity;

        System.out.println("You have bought "+ quantity +" "+ item + "/s");
        System.out.println("Your total is "+currency+total);
    }
}
