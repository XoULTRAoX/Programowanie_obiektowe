import java.util.ArrayList;

public class Account {
    private String Name;
    private String Surname;
    private double Bal;
    private String PIN;
    protected static ArrayList<Account> accountsList = new ArrayList<>();
    public static Account currentAccount;

    public Account(String Name, String Surname, double Bal, String PIN) {
        if(Bal < 0) {
            System.out.println("Starting balance cannot be less than zero.\n" +
                            "Balance set to $0.00");
            this.Bal = 0.00;
        }else {
            this.Name = Name;
            this.Surname = Surname;
            this.Bal = Bal;
            this.PIN = PIN;
        }
    }
    public String getName() {
        return Name;
    }
    public String getSurname() {
        return Surname;
    }
    public double getBal() {
        return Bal;
    }
    public String getPIN() {
        return PIN;
    }
    public void setName(String newName) {
        this.Name = newName;
    }
    public void setSurname(String newSurname) {
        this.Surname = newSurname;
    }
    public void setBal(double newBal) {
        this.Bal = newBal;
    }
    public void setPin(String newPin) {
        this.PIN = newPin;
    }
    
}