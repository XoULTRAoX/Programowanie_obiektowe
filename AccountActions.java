import java.util.Scanner;
import java.util.ArrayList;

public class AccountActions {
    private static Scanner scanner = new Scanner(System.in);
    //Change account details
    public static void changeAccountData(){
        System.out.println("Enter new name:");
        String newName = scanner.nextLine();
        Account.currentAccount.setName(newName);
        System.out.println("Enter new surname:");
        String newSurname = scanner.nextLine();
        Account.currentAccount.setSurname(newSurname);
        String newPin = "0000";
        boolean correctPin = false;
        while (!correctPin) {
            System.out.println("Enter new PIN: ");
            newPin = scanner.nextLine();
            if (newPin.length() != 4 || !newPin.matches("[0-9]+")) {
                System.out.println("------------------------------------------------------------\n" + 
                                "PIN must be a 4-digit number.");
                continue;
            }
            correctPin = true;
        }
        Account.currentAccount.setPin(newPin);
        System.out.println("Your account data has been updated.");
    }
    // Display current account balance
    public static void checkBalance(){
        System.out.println("Your current balance is: $" + Account.currentAccount.getBal());
    }
    // Making a transfe
    public static void makeTransfer(){
        AccountActions.displayAccountsList();
        int transferId = 0;
        boolean correctTransferID = false;
        while (!correctTransferID) {
            System.out.println("Enter the ID of the account you want to transfer money to:");
            try {
                transferId = Integer.parseInt(scanner.nextLine());
                correctTransferID = true;
            } catch (NumberFormatException e) {
                System.out.println("------------------------------------------------------------\n" + 
                                "ID must be a number.");
            }
        }
        double transferAmount = 0.0;
        boolean correctTransferAmount = false;
        while (!correctTransferAmount) {
            System.out.println("Enter the amount you want to transfer:");
            try {
                transferAmount = Double.parseDouble(scanner.nextLine());
                correctTransferAmount = true;
            } catch (NumberFormatException e) {
                System.out.println("------------------------------------------------------------\n" + 
                                "Transfer amount must be a number.");
            }
        }
        
        if(transferAmount > Account.currentAccount.getBal()){
            System.out.println("You do not have enough funds to complete this transfer. Please try again.");
        }else{
            Account.currentAccount.setBal(Account.currentAccount.getBal() - transferAmount);
            Account transferAccount = Account.accountsList.get(transferId);
            transferAccount.setBal(transferAccount.getBal() + transferAmount);
            System.out.println("Transfer successful!");
        }
    }
    // Account logout
    public static void logout(){
        Account.currentAccount = null;
        System.out.println("You have been logged out. Goodbye!");
        return;
    }
    // Display account information
    public void displayInfo(){
        if(Account.currentAccount != null){
            System.out.printf("============================================================\n" + 
                            "Account info: %s %s\nAccount balance: $%.2f\nAccount PIN: %s\n",
                            Account.currentAccount.getName(), Account.currentAccount.getSurname(),
                            Account.currentAccount.getBal(), Account.currentAccount.getPIN());
        } else {
            System.out.println("Account is not set, please login or create new account.");
        }
    }
    //List all accounts - without ID
    public static void showAllAccount(Account account){
        System.out.printf("%s %s - $%.2f\n", account.getName(), account.getSurname(), account.getBal());
    }
    //List all accounts - with ID
    public static void displayAccountsList(){
        new Menu().accountsHeadline();
        for(int i = 0; i < Account.accountsList.size(); i++){
            System.out.println("Account ID: " + i);
            Account account = Account.accountsList.get(i);
            showAllAccount(account);
            System.out.println("------------------------------------------------------------");
        }
    }
    //Account closure
    public static void deactivate(){
        int ID = 0;
        String enteredPIN = "0000";
        new Menu().accountsHeadline();
        for(int i = 0; i < Account.accountsList.size(); i++){
            System.out.println("Account ID: " + i);
            Account account = Account.accountsList.get(i);
            showAllAccount(account);
            System.out.println("------------------------------------------------------------");
        }
        boolean correctID = false;
            while (!correctID) {
                System.out.println("Account ID to be closed: ");
                try {
                    ID = Integer.parseInt(scanner.nextLine());
                    correctID = true;
                } catch (NumberFormatException e) {
                    System.out.println("------------------------------------------------------------\n" + 
                                    "ID must be a number.");
                }
            }
        Account accountToDelete = Account.accountsList.get(ID);
        boolean correctPin = false;
        while (!correctPin) {
            System.out.println("Enter account PIN: ");
            enteredPIN = scanner.nextLine();
            if (enteredPIN.length() != 4 || !enteredPIN.matches("[0-9]+")) {
                System.out.println("------------------------------------------------------------\n" + 
                                "PIN must be a 4-digit number.");
                continue;
            }
            correctPin = true;
        }
        if(enteredPIN.equals(accountToDelete.getPIN())){
            Account.accountsList.remove(accountToDelete);
            System.out.println("------------------------------------------------------------\n" +
                            "Account has been deleted");
        } else {
            System.out.println("------------------------------------------------------------\n" +
                            "Incorrect PIN or account ID\nThe account has not been closed.");
        }
    }
    //Close the currently used account
    public static void deleteCurrentAccount(){
        Account.accountsList.remove(Account.currentAccount);
        Account.currentAccount = null;
        System.out.println("------------------------------------------------------------\n" +
                        "Account has been deleted");
    }

}

