import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean quit = false;
        //Adding fake accounts
        Data.add();
        int choice;
        Scanner scanner = new Scanner(System.in);
        while(!quit){
            int pinCheck;
            new Menu().Main();
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice. Must be a number.");
                scanner.nextLine();
                continue;
            }
            //Main menu
            switch(choice){
                case 1:
                    Account account = Create.NewAccount();
                    new AccountActions().displayInfo();
                    break;
                case 2:
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter surname:");
                    String surname = scanner.nextLine();
                    System.out.println("Enter 4-digit PIN:");
                    String pin = scanner.nextLine();
                    try {
                        pinCheck = Integer.parseInt(pin);
                        if (pin.length() != 4) {
                            throw new NumberFormatException();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("------------------------------------------------------------\n" +
                                        "PIN must be a 4-digit number.");
                        continue;
                    }
                    if(Login.checkLogin(name, surname, pin)){
                        System.out.println("------------------------------------------------------------\n" +  
                                        "Login successful!");
                        Login.FrontPage();
                    }else{
                        System.out.println("Invalid login details.\nPlease try again.");
                    }
                    break;
                case 3:
                     new AccountActions().deactivate();
                    break;
                case 4:
                    new AccountActions().displayAccountsList();
                    break;
                default:
                    System.out.println("------------------------------------------------------------\n" +
                                        "Invalid choice.");
                    break;
            }
        }
        scanner.close();
    }
}
