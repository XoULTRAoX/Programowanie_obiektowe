class Menu {
    public void Main(){
        System.out.printf("============================================================\n" +
                    "%35s\n" +
                    "============================================================\n" +
                    "Please select an option:\n" +
                    "1 - Create new account\n" +
                    "2 - Log in to your account\n" +
                    "3 - Close account\n" +
                    "4 - List of active accounts\n" +
                    "============================================================\n" +
                    "Choice: ","BankApp v1.0");
    }
    public void accountPanel(){
        System.out.printf("============================================================\n" +
                    "%35s\n" +
                    "============================================================\n" +
                    "Please select an option:\n" +
                    "1 - Change account details\n" +
                    "2 - View account information\n" +
                    "3 - Check balance\n" +
                    "4 - Make a transfer\n" +
                    "5 - Close this account\n" +
                    "6 - Log out\n" +
                    "============================================================\n" +
                    "Choice: ","BankApp v1.0");
    }
    public void accountsHeadline(){
        System.out.printf("============================================================\n" +
                    "%45s\n" +
                    "============================================================\n",
                    "List of open accounts in our bank");
    }
}