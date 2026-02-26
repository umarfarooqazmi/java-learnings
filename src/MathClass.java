import java.util.Scanner;
public class MathClass {
    public static void main (String[] args){

//        System.out.println(Math.PI);
//        System.out.println(Math.E);

//        double result;
//        result = Math.pow(2, 3); // 2 to the power 3
//        result = Math.abs(-5);
//        result = Math.sqrt(9);
//        result = Math.round(11.2121);
//        result = Math.ceil(11.2121);
//        result = Math.floor(11.821);
//        result = Math.max(10, 20);
//        result = Math.min(10,20);
//
//
//
//        System.out.println(result);

        //Hypotenuse c = Math.sqrt(a^2 + b^2)
//        Scanner scanner=new Scanner(System.in);
//
//        System.out.print("Enter side a: ");
//        double a=scanner.nextDouble();
//        System.out.print("Enter side b: ");
//        double b = scanner.nextDouble();
//
//        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//        System.out.println("Hypotenuse is: "+c);
//
//
//
//
//        scanner.close();


        //circumference = 2 * Math.PI * radius
        // area = Math.PI * Math.pow(radius, 2)
        //volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;

        System.out.printf("Circumference: %.1fcm\n", circumference);

        double area = Math.PI* Math.pow(radius, 2);
        System.out.printf("Area: %.1fcm^2\n", area);

        double volume =  (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("Volume: %.1fcm^3", volume);





        scanner.close();

    }
}
