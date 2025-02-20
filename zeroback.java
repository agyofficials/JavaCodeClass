import java.util.Arrays;
import java.util.Scanner;

public class zeroback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int index = 0; index < size; index++) {
            System.out.print("Enter the element at index \'" + index + "\' Here : ");
            array[index] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Output, Elements inside the array");
        for (int index = 0; index < size; index++) {
            System.out.print(array[index] + ", ");
        }

        // Let's sort the array first
        Arrays.sort(array);

        System.out.println();
        System.out.println("Output, Elements inside the array after sorting");
        for (int index = 0; index < size; index++) {
            System.out.print(array[index] + ", ");
        }

        // Shift all zeros to the back
        int nonZeroIndex = 0;
        for (int index = 0; index < size; index++) {
            if (array[index] != 0) {
                array[nonZeroIndex++] = array[index];
            }
        }
        while (nonZeroIndex < size) {
            array[nonZeroIndex++] = 0;
        }

        System.out.println();
        System.out.println("Output, Elements inside the array after shifting zeros to the back");
        for (int index = 0; index < size; index++) {
            System.out.print(array[index] + ", ");
        }

        sc.close();
    }
}