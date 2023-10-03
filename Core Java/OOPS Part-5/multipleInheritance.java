// class Greet {
//     void show() {
//         System.out.println("This is class Greet");
//     }
// }
// class Mario {
//     void show() {
//         System.out.println("This is class Mario");
//     } 
// }
// class multipleInheritance extends Greet,Mario {
//     public static void main(String[] args) {
//         multipleInheritance m = new multipleInheritance();
//         m.show();
//     }
// }

// interface Greet {
//     void show();
// }
// interface Mario {
//     void show();
// }
// class multipleInheritance implements Greet,Mario {
//     public void show() {
//         System.out.println("Interface");
//     }
//     public static void main(String[] args) {
//         multipleInheritance m = new multipleInheritance();
//         m.show();
//     }
// }

// interface Greet {
//     void display();
// }
// interface Mario {
//     void show();
// }
// class multipleInheritance implements Greet,Mario {
//     public void show() {
//         System.out.println("Interface Mario");
//     }
//     public void display() {
//         System.out.println("Interface Greet");
//     }
//     public static void main(String[] args) {
//         multipleInheritance m = new multipleInheritance();
//         m.show();
//         m.display();
//     }
// }