//Task 
    //Create an array, take user input of the size, and elements
    //Take user input of the value you want to find inside the array
    //print the index of the array, and number of occourances
import java.util.Scanner;
public class countzero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //bject of the scanner class

        //Take User input of the size of the array
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();

        //Initilization of the array
        int [] array = new int[size];


        //Assign elements of the array
        for(int i = 0; i < size; i++){ //to count and the index of the array
            System.out.print("Enter the element at the Index : " + i + " Here : ");
            array[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("Elements of the Array");  //print the elements of the array
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + ", ");
        }
        
        System.out.println();
        System.out.print("Enter the value to find the occurance of : ");
        int value = scan.nextInt(); // save the user-input value to next find it occourance
        int occour = 0; //Create a variable to store and count 
        for(int i = 0; i < size; i++){
            if(array[i] == value){
                System.out.println("Occurance of \'" + value + "\'"  + " at index : " + i);
                occour++;
            }
        }
        System.out.println("Total Occourance of the \'" + value + "\' : " + occour);

        scan.close();
    }
    
}
