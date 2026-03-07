//abstract class Shape {
//    abstract void area();
//}
//class Circle extends Shape {
//    double radius;
//    Circle(double radius) {
//        this.radius = radius;
//    }
//    @Override
//    void area() {
//        double area = Math.PI * radius * radius;
//        System.out.println("Area of Circle is: " + area);
//
//    }
//}
//class Rectangle extends Shape {
//    double length;
//    double width;
//    Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//
//    }
//    @Override
//    void area() {
//        double area = length * width;
//        System.out.println("Area of Rectangle is: " + area);
//    }
//}
//class Triangle extends Shape {
//    double base;
//    double height;
//    Triangle(double base, double height) {
//        this.base = base;
//        this.height = height;
//    }
//    void area() {
//        double area = 0.5 * base * height;
//        System.out.println("Area of Triangle is: " + area);
//    }
//}
//class Main{
//    public static void main(String[] args) {
//        Circle circle = new Circle(5);
//        Rectangle rectangle = new Rectangle(10,20);
//        Triangle triangle = new Triangle(10,20);
//
//        circle.area();
//        rectangle.area();
//        triangle.area();
//    }
//}