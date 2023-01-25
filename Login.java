import java.util.Scanner;
import java.util.ArrayList;

public class Login {
    private static Scanner scanner = new Scanner(System.in);
    //Menu available after logging in
    public static void FrontPage(){
            boolean quit = false;
            int choice;
            while(!quit){
                new Menu().accountPanel();
                choice = scanner.nextInt();
                scanner.nextLine(); // to fix the issue with nextLine() not capturing the input
                switch(choice){
                    case 1:
                        AccountActions.changeAccountData();
                        break;
                    case 2:
                        new AccountActions().displayInfo();
                        break;
                    case 3:
                        AccountActions.checkBalance();
                        break;
                    case 4:
                        AccountActions.makeTransfer();
                        break;
                    case 5:
                        AccountActions.deleteCurrentAccount();
                        quit = true;
                        break;
                    case 6:
                        AccountActions.logout();
                        quit = true;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
    }
    //Check if given data matches any account
    public static boolean checkLogin(String name, String surname, String pin){
        for(Account account :  Account.accountsList){
            if(account.getName().equalsIgnoreCase(name) && account.getSurname().equalsIgnoreCase(surname) && account.getPIN().equals(pin)){
                Account.currentAccount = account;
                return true;
            }
        }
        return false;
    }
}