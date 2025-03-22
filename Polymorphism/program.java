class Pizza{
    public void desert(){
        System.out.println("This is an desert from Dominos");
    }
}
class Burger extends Pizza{
    public void desert(){
        System.out.println("This is an desert from Pizzahut");
    }
}
class Momo extends Burger{
    public void desert(){
        System.out.print("This desert is from momo cafe");
    }
}
class program{
    public static void main(String[] args) {
        Pizza myPizza = new Pizza();
        Pizza myBurger = new Burger();
        Pizza myMomo = new Momo();

        myPizza.desert();
        myBurger.desert();
        myMomo.desert();
    }
}