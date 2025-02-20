import java.util.Scanner;
class table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Value : ");
        int start = sc.nextInt();

        System.out.print("Enter End Value : ");
        int end = sc.nextInt();

        for(int i = start; i <= end; i++){
            System.out.println("Table of : " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
        sc.close();


    }
}