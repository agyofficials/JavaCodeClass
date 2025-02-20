class Program{
    int global_variable = 10;
    String values = "Test Data";
    public static void main(String [] args){
        System.out.println("Hello Test");

        //Calling the Global Value
        Program ps =  new Program();
        System.out.print("The next value will be from the Global Value");
        System.out.print(ps.global_variable);

        //Calling String Variable
        System.out.println();
        System.out.print("Test + Test : " + ps.values);

    }
}