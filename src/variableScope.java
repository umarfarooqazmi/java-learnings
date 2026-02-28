public class variableScope {
     static int x = 3;// this is class scope

    public static void main (String[] args){
         int x = 1; //Local

        System.out.println(x);

        doSomething();
    }
    static void doSomething(){
         int x = 2;
        System.out.println(x);
    }
}
