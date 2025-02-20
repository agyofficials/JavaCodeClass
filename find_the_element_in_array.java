import java.util.Scanner;
class find_the_element_in_array{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();

        int[] array = new int[size];

        for(int index = 0; index < size; index++){
            System.out.print("Enter the Value at Index  * " + index + " * - Here : ");
            array[index] = scan.nextInt();
        }
        System.out.println();
        for(int index = 0; index < size; index++){
            System.out.print(array[index] + " ");
        }
        System.out.println();
        System.out.print("Enter the value you want to find inside of the array : ");
        int find = scan.nextInt();

        int count = 0;

        for(int index = 0; index < size; index++){
            if(array[index] == find){
                System.out.println("Fount at Index : " + index);
                count++;
            }
        }
        System.out.println();
        if(count == 0){
            System.out.println("No Occourances Found");
        }
        else{
            System.out.println("Total Count of the Value " + count);
        }

        scan.close();
    }
}
