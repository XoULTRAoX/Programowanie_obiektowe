public class Data {
    //Adding fake accounts
    public static void add(){
        Account account1 = new Account("Monica","Bellucci",1000000,"0000");
        Account account2 = new Account("Chris","Evans",1000000.10,"0000");
        Account account3 = new Account("Joe","Manganiello",4356.95,"0000");
        Account.accountsList.add(account1);
        Account.accountsList.add(account2);
        Account.accountsList.add(account3);
    }
}