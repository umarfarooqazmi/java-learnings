public class StringMethods {
    public static void main (String[] args){

        String name = "Password";

//        int length = name.length();
//        int index = name.indexOf("o");
//        int lIndex = name.lastIndexOf("o");
//          char letter = name.charAt(0);
//
//          System.out.println(letter);





//        System.out.println(name.trim());

//        if(name.contains(" ")){
//            System.out.println("Invalid Name!");
//        }
//        else {
//            System.out.println("Name is "+ name);
//        }

//        if(name.isEmpty()){
//            System.out.println("Name is Empty");
//        } else {
//            System.out.println("Name is "+name);
//        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name cannot be password");
        }
        else {
            System.out.println("Your name is "+name);
        }
    }
}
