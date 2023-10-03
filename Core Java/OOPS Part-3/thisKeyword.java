// 1st point
// class thisKeyword {
//     void show(){
//         System.out.println(this);
//     }
//     public static void main(String[] args) {
//         thisKeyword A = new thisKeyword();
//         System.out.println(A);
//         A.show();
//     }
// }

// 2nd point
// class thisKeyword {
//     int a;  //instance
//     thisKeyword(int a) {  //local
//         a = a;
//         // this.a = a;
//     }
//     void show() {
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         thisKeyword A = new thisKeyword(100);
//         A.show();
//     }
// }

// 3rd point
// class thisKeyword {
//     thisKeyword(){
//         System.out.println("Hello, developers");
//     }
//     thisKeyword(int a) {
//         this();
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         thisKeyword A = new thisKeyword(100);
//     }
// }

// 4th point
// class thisKeyword {
//     thisKeyword(){
//         this(100);
//     }
//     thisKeyword(int a) {
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         thisKeyword A = new thisKeyword();
//     }
// }