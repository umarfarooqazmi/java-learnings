public class Student {
    // Constructor = A special method to initialize objects
    //               you can pass arguments to a constructor
    //               and set up initial values

    String name;
    int age;
    double gpa;
    boolean isStudying = false;
    Student  (String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa= gpa;

    }

    void study(){
        isStudying=true;
        System.out.println(this.name +" is studying");
    }


}
class main{
    public static void main(String[] args) {
        Student student1 = new Student("BOB", 50, 3.2);
        Student student2 = new Student("Juan", 40, 3.2);

//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.gpa);
//
//        System.out.println(student2.name);
//        System.out.println(student2.age);
//        System.out.println(student2.gpa);
          student1.study();

    }

}
