import java.util.Random;
public class randomNumbers {
    public static void main(String[] args){

        Random random = new Random();

        int number;
        number = random.nextInt(1, 7 ); // first number is inclusive second number is exclusive

        System.out.println(number);

        boolean isHeads;
        isHeads = random.nextBoolean();
//        System.out.println(isHeads);
        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }

    }
}
