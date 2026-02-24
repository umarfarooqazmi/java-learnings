public class Variables {
    public static void main (String[] args){
        // ❎ variable = a reusable container for a value
        //               a variable behaves as if it ws the value it contains

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to hte (heap)

        // Primitive   vs   Reference3
        // int              string
        //double            array
        //char              object
        //boolean

        // 2 steps to create a variable
        // 1. declaration
        // 2. assignment

        int age = 21;

        System.out.println(age);

        int year = 2026;
        System.out.println("The year is " + year);

        double price = 19.99;
        System.out.println(price);
        double gpa = 3;
        System.out.println(gpa);

        char gender = 'M';
        System.out.println(gender);
        char symbol = '!';
        System.out.println(symbol);

        boolean isStudent = true;
        boolean forSale = false;

        System.out.println(isStudent);

        String name= "Umar Farooq";

        System.out.println(name);



    }

}
