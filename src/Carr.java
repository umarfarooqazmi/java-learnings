import java.util.Scanner;

public class Carr {
    private String model;
    private String color;
    private int price;

    Carr(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;

    }

     String getModel() {
        return this.model;
    }
     String getColor() {
        return this.color;
     }
     String getPrice() {
        return "$" + this.price;
     }

     void setModel(String model) {
        this.model = model;
     }
     void setColor(String color) {
        this.color = color;
     }
}
class Main {
    public static void main(String[] args) {
        Carr carr = new Carr("BMW", "Red", 100);

        carr.setModel("Mercedes");
        carr.setColor("Blue");

        System.out.println(carr.getModel() + " " + carr.getColor() + " " +  carr.getPrice());
    }
}
