import java.util.Scanner;

public class task {

    public int userIPX() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number (x): ");
        int x = scan.nextInt();
        return x;
    }

    public int userIPY() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the second number (y): ");
        int y = scan.nextInt();
        return y;
    }

    public int Add(int x, int y) {
        return x + y;
    }

    public int Difference(int x, int y) {
        return x - y;
    }

    public int Product(int x, int y) {
        return x * y;
    }

    public int Division(int x, int y) {
        return x/y;
    }

    public static void main(String[] args) {
        task sc = new task();

        int x = sc.userIPX();
        int y = sc.userIPY();

        int add = sc.Add(x, y);
        System.out.println("Sum: " + add);

        int difference = sc.Difference(x, y);
        System.out.println("Difference: " + difference);

        int product = sc.Product(x, y);
        System.out.println("Product: " + product);

        int division = sc.Division(x, y);
        System.out.println("Division: " + division);
    }
}
