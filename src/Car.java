public class Car {

    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You started the engine");
    }

    void stop(){
        isRunning = false;
        System.out.println("You stopped the engine");
    }

    public static void main(String[] args){
        String make = "BMW";
        String model = "M4 COMP";
        int year = 1980;
        double price = 100.00;

        Car car = new Car();

        car.start();
        car.stop();
    }
}