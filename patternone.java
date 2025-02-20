import java.util.Scanner;
public class patternone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value for the limit : ");
        int limit = scan.nextInt();

        scan.close();
        char c = 'A';

        for(int i = 1; i <= limit; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
 
    }
    
}
