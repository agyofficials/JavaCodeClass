import java.util.Scanner;
class twoDarray{
    public static void main(String[] args) {
        // array_data_type [] name_of_the_array = new value_data_type[size];
        //int[] array = new int[5]; //This is how we decleare 1D array in Java

        //int[][] matrix = new int[r-size][c-size];

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the row : ");
        int row = scan.nextInt(); //Store the user input of the array row size

        System.out.print("Enter the size of the column : ");
        int column = scan.nextInt(); //Store the user input of the array column size

        int[][] matrix = new int[row][column];
        int i = 1;

        for(int row_index = 0; row_index < row; row_index++){
            for(int col_index = 0; col_index < column; col_index++){
                // System.out.print("Enter the value for " + row_index + " " + col_index + " Here :");
                matrix[row_index][col_index] = i++;
            }
        }
        for(int row_index = 0; row_index < row; row_index++){
            for(int col_index = 0; col_index < column; col_index++){
                System.out.print(matrix[row_index][col_index] + " ");
            }
            System.out.println();
        }

        
    }
}