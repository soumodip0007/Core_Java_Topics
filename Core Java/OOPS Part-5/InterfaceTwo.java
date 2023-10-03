// Why interface variables are public, static and final?

interface player {
    double ammo = 7.62;    //public + static + final
    // void georgopol();   //public + abstract
    public abstract void georgopol(); //public
}
class gun implements player{
    @Override
    public void georgopol() {
    // ammo = 5.56;  //final
    System.out.println("Player needs " +ammo+ " ammo");
   }
}
class InterfaceTwo {
    public static void main(String[] args) {
        player c = new gun();
        c.georgopol();
        // System.out.println(player.ammo); //static
    }
}