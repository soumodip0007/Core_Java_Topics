abstract class Person {
    Person() {
        System.out.println("Teacher and Student");
    }
    public abstract void sleep();
}
class Teacher extends Person { //super class
    Teacher() {
        super();
    }
    public void sleep() {
        System.out.println("The time is 12:00 AM, teacher will sleep.");
    }
}
class Student extends Person {
    Student() {
       super(); 
    }
    public void sleep() {
        System.out.println("The time is 2:00 AM, student will sleep.");
    }
}
class abstractClass {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        t.sleep();
        s.sleep();
    }
}