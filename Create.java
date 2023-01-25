import java.util.Scanner;
import java.util.ArrayList;

public class Create {
    private static Scanner scanner = new Scanner(System.in);
    //Create a new account
    public static Account NewAccount() {
        String Name;
        String Surname;
        double Balance = 0.00;
        String PIN = "0000";
        boolean ActiveAccount = true;
        System.out.println("============================================================");
        System.out.printf("Let's create a new account for you!\n");
        System.out.println("============================================================");
        System.out.println("Please enter your details below.");
        System.out.println("Your name: ");
        Name = scanner.nextLine();
        System.out.println("Your surname: ");
        Surname = scanner.nextLine();
        boolean correctBalance = false;
        while (!correctBalance) {
            System.out.println("Starting balance: ");
            try {
                Balance = Double.parseDouble(scanner.nextLine());
                correctBalance = true;
            } catch (NumberFormatException e) {
                System.out.println("------------------------------------------------------------\n" + 
                                "Balance must be a number.");
            }
        }
        boolean correctPin = false;
        while (!correctPin) {
            System.out.println("Account PIN: ");
            PIN = scanner.nextLine();
            if (PIN.length() != 4 || !PIN.matches("[0-9]+")) {
                System.out.println("------------------------------------------------------------\n" + 
                                "PIN must be a 4-digit number.");
                continue;
            }
            correctPin = true;
        }
        Account newAccount = new Account(Name,Surname,Balance,PIN);
        Account.accountsList.add(newAccount);
        Account.currentAccount = newAccount;
        return newAccount;
    }
}