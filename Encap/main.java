class apple{
    private int varThree = 50;
    private double varFour = 100.101;

    public int setData(int x){
        this.varThree = x;
        return varThree;
    }
    public int getData(){
        // System.out.println("Try to fetch information from Variable Three : " + varThree);
        return varThree;

    }

}

class main extends apple{
    // int varOne = 10; //Global Varibale | reference variable
    // final float varTwo = 25.2f; //Global Varibale | reference variable

    public static void main(String[] args) {
        main myOBJ = new main();
        // System.out.println("Before :" + myOBJ.varOne);
        // myOBJ.varOne = 15;
        // System.out.println("After :" + myOBJ.varOne);

        // //Calling the varaible two
        // System.out.println("Variable 2 Before : " + myOBJ.varTwo);
        // myOBJ.varTwo = 30.7f;
        // System.out.println("Variable 2 After : " + myOBJ.varTwo);

        //Accessing the Data Information of Class Apple
        // System.out.println("From Apple " + myOBJ.varThree);
        // System.out.println("From Apple Before " + myOBJ.varFour);
        // myOBJ.varFour = 200.101;
        // System.out.println("From Apple After " + myOBJ.varFour);

        myOBJ.setData(45);
        System.out.println(myOBJ.getData());




        
    }

}