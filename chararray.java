import java.util.Scanner;
public class chararray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total count of character of your word : ");
        int size = scan.nextInt();

        char[] array = new char[size];

        for(int index = 0; index < size; index++){
            System.out.print("Enter a Char at Index : " + index + " Here : ");
            
            array[index] = scan.next().charAt(0);
        }

        System.out.println();
        System.out.println("The Values you entered are : ");
        for(int index = 0; index < size; index++){
            System.out.print(array[index] + " ");
        }
        scan.close();
    }
    
}
