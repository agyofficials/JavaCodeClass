import java.util.Arrays;
import java.util.Scanner;
public class shortarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for(int index = 0; index < size; index++){
            System.out.print("Enter the element at index \'" + index + "\' Here : " );
            array[index] = sc.nextInt();
        }
        
        System.out.println();
        System.out.println("Output, Elements inside the array");
        for(int index = 0; index < size; index++){
            System.out.print(array[index] + ", ");
        }

        //Let's sort the array first
        Arrays.sort(array);

        System.out.println();
        System.out.println("Output, Elements inside the array after sorting");
        for(int index = 0; index < size; index++){
            System.out.print(array[index] + ", ");
        }
        sc.close();
    }
}
