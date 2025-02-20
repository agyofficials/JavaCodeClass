import java.util.Scanner;
public class atmclone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Here are the default static variables and values
        int userNAME = 2468;
        int userPASS = 1234;
        int Balance = 500;
        int transactionCode = 123;

        System.out.println("Welcome to Dell Systems ATM"); // Welcome messege for the user.
        System.out.println("I Hope you are fine !"); //Greet the operating user

        System.out.println(); //Gives a blank line

        System.out.print("Enter your user name : "); //direction to ask for the username
        int userName = scan.nextInt(); //Accept the user input and store to the variable

        if(userNAME == userName) {      // check weather the user value matches the database
            System.out.println("Welcome Admin"); //Greets the Admin
            System.out.println(); //Gives a blank line ( to look it like professional )

            System.out.print("Enter your passcode : ");
            int userPass = scan.nextInt(); //accept and store it to the variable

            if(userPass == userPASS){ //check and verify weather passcode is correct
                System.out.println("Please Choose your Transaction Type");
                System.out.println("1. Balance 2. Deposit 3. Withdraw");
                int userChoice = scan.nextInt();
                if(userChoice == 1){
                    System.out.println("Balance");
                    System.out.println("Your balance is : " + Balance);
                }
                else if(userChoice == 2){
                    System.out.println("Deposit"); //a messege
                    System.out.print("Enter the amount you want to deposit : "); //a messege or direction 
                    int Deposit = scan.nextInt(); //store the value
                    Balance = Deposit + Balance; //update the balance to the variable already exist

                    System.out.println(); //gives a blank
                    System.out.println("The Updated Balance : " + Balance); //print the updated balance
                }
                else if(userChoice == 3){
                    System.out.println("Withdraw"); //a messege
                    System.out.println("Enter the amount you want to Withdraw : "); //just a messege
                    int Withdraw = scan.nextInt(); //store the withdraw amount
                    
                    for(int count = 1; count <= 3; count++){ //count for attempts
                        System.out.print("Enter the transaction code : "); // prints a messege
                        int transactionCODE = scan.nextInt(); //accept and store the user input
                        if(transactionCODE == transactionCode){ //check for the tranction code
                            System.out.println("Sucessful"); //a messege
                            System.out.println(); //gives a blank line
                            Balance = Balance - Withdraw; //deduct the balance
                            System.out.println("The Balance Available : " + Balance); //Print the balance after transaction
                            break;
                        }
                        else{
                            System.out.println("Try Again"); //Attempt notification
                        }
                    }
                    System.out.println("Transaction Declined"); //Messege & notification to let the user the tranaction declined
                }

            }


        }
        System.out.println("Thank you, Visit Again"); //Last Messege to Greet 
        scan.close(); //close the scanner object
    }
    
}
