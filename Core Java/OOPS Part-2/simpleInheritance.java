class Mario {  //Super class
    int roll, marks;
    String name;
    void input(){
        System.out.println("Your roll name & marks: ");
    }
}
class simpleInheritance extends Mario {  //Sub class
    void show(){
        roll=1; name="Mario"; marks=95;
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args) {
        simpleInheritance A = new simpleInheritance();
        A.input();
        A.show();
    }
}