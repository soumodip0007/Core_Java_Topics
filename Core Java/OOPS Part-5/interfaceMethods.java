// with abstract method 
// interface FullStack {
//     void webDesign();  //public + abstract
//     void webDevelop();  //public + abstract
// }
// class HTML implements FullStack {
//     @Override
//     public void webDesign() {
//         System.out.println("FrontEnd Development");
//     }
// }
// class interfaceMethods {
//     public static void main(String[] args) {
//         HTML h = new HTML();
//         h.webDesign();
//     }
// }

// without abstract method 
// interface FullStack {
//     void webDesign();  //public + abstract
//     void webDevelop();  //public + abstract
// }
// abstract class HTML implements FullStack {
//     @Override
//     public void webDesign() {
//         System.out.println("FrontEnd Development");
//     }
// }
// class CSS extends HTML {
//     @Override
//     public void webDevelop() {
//         System.out.println("BackEnd Development");
//     }
// }
// class interfaceMethods {
//     public static void main(String[] args) {
//         CSS c = new CSS();
//         c.webDesign();
//         c.webDevelop();
//     }
// }
