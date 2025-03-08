class Dominos{
    int price_Pizza = 499;
    int price_Desert = 99;
    public void Pizza(){
        System.out.println("This is Farmhouse Pizza");
    }
    public void Desert(){
        System.out.println("Choco Lava Cake");
    }
}

class MacD extends Dominos{
    int price_Burger = 399;
    int price_Bevrage = 79;
    public void Burger(){
        System.out.println("Veg Suprime Burger");
    }
    public void Bevrage(){
        System.err.println("Coke with ICE");
    }
}

final class MLevel extends MacD{
    public static void main(String[] args) {
        MLevel fetch_data = new MLevel();

        fetch_data.Pizza();
        System.out.println("Price : " + fetch_data.price_Pizza);
        
        fetch_data.Desert();
        System.out.println("Price : " + fetch_data.price_Desert);

        fetch_data.Burger();
        System.out.println("Price : " + fetch_data.price_Burger);
        
        fetch_data.Bevrage();
        System.out.println("Price : " + fetch_data.price_Bevrage);
        
    }

}