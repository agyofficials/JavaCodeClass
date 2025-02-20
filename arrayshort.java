import java.util.Arrays;
import java.util.Scanner;
public class arrayshort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();

        int [] array = new int[size];

        for(int index = 0; index < size; index++){
            System.out.print("Enter the value at index * " + index + " * - Here : ");
            array[index] = scan.nextInt();
        }
        System.out.println();
        System.out.println("Original Array");
        
        for(int index = 0; index < size; index++){
            System.out.print(array[index] + " ");
        }
        System.out.println();
        System.out.println("Sorted Array");

        Arrays.sort(array);

        for(int index = 0; index < size; index++){
            System.out.print(array[index] + " ");
        }

        scan.close();

    }
    
}
