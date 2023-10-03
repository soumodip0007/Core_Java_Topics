// 1st way
// abstract class Programming {
//     public abstract void Developer();
//     public abstract void Relation();
// }
// class React extends Programming{
//     @Override
//     public void Developer() {
//         System.out.println("Jordan Walke introduced React");
//     }
//     @Override
//     public void Relation() {
//         System.out.println("It's a JavaScript library");
//     }
// }
// class JavaScript extends Programming{
//     @Override 
//     public void Developer() {
//         System.out.println("Brendan Eich created JavaScript");
//     }
//     @Override
//     public void Relation() {
//         System.out.println("JavaScript used in react");
//     }
// }
// class abstractMethod {
//     public static void main(String[] args) {
//         React r = new React();
//         r.Developer();
//         r.Relation();
//         JavaScript j = new JavaScript();
//         j.Developer();
//         j.Relation();
//         //We can create object reference of abstract class
//         // Programming r = new React();
//         // r.Developer();
//         // Programming j = new JavaScript();
//         // j.Developer();
//     }
// }



// abstract class Programming {
//     public abstract void Developer();
//     public abstract void Relation();
// }
// abstract class React extends Programming{
//     @Override
//     public void Developer() {
//         System.out.println("Jordan Walke introduced React");
//     }
// }
// class JavaScript extends React{
//     @Override
//     public void Relation() {
//         System.out.println("JavaScript used in react");
//     }
// }
// class abstractMethod {
//     public static void main(String[] args) {
//         Programming j = new JavaScript();
//         j.Developer();
//         j.Relation();
//     }
// }