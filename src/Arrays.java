public class Arrays {
    public static void main(String[] args) {

        // array = a collection of values of the same datatype ( think of it as a variable that can store more than one value)

        String[] fruits = {"apple", "orange", "banana", "grapes"};
//         String fruit = fruits[0];
//        fruits[0]="pineapple";
//        String fruit = fruits[0];
//        int n = fruits.length;
//        System.out.println(n);
//        java.util.Arrays.sort(fruits);
        java.util.Arrays.fill(fruits, null);


        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
