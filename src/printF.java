
public class printF {
    public static void main(String[] args){
        //printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

//        String name = "Spongebob";
//        char firstLetter = 'S';
//        int age = 30;
//        double height = 60.5;
//        boolean isEmployed = true;
//
//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Your name starts with %c\n", firstLetter);
//        System.out.printf("Your age is %d\n", age);
//        System.out.printf("Your height is %f\n", height);
//
//        System.out.printf("%s is %d years old \n", name, age);

//        double price1 = 9.99;
//        double price2 = 100.15;
//        double price3 = -54.01;
//
//        System.out.printf("%.2f\n", price1);
//        System.out.printf("%.1f\n", price2);
//        System.out.printf("%.1f\n", price3);

        // [flags]

        // + = output a plus
        // , = comma grouping seperator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, spce if positive

//        double price1 = 900000.99;
//        double price2 = 100000.15;
//        double price3 = -54000.01;
//        double price4 = -40000.00;
//
//        System.out.printf("%+.2f\n", price1);
//        System.out.printf("%,.1f\n", price2);
//        System.out.printf("%(.1f\n", price3);
//        System.out.printf("% .1f\n", price4);

        //[width]

        // 0 = zero padding
        //number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%04d\n", id4);



    }
}
