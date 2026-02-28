public class Method {
    public static void main(String[] args) {

        // method = it is a block of reuable code that is executed whenever it is called ()

        int age = 1;

        if (checkAge(age)){
            System.out.println("You may sign up");

        } else{
            System.out.println("You should be 18+ to sign up");
        }

    }
    static boolean checkAge(int age){
        if(age >= 18){
            return true;

        } else {
            return false;

        }
    }
}

