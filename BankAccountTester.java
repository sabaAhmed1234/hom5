package Library.howemork;

import Library.howemork.BankAccount;

public class BankAccountTester {
    public static void main(String[] args) {
    BankAccount account=new BankAccount();
        account.Setdeposite(1000);
        account.Setdeposite(500);
        account.Setdeposite(400);
        account.get_remaining_balance();
        System.out.println("expected result = "+100);
        account.Setdeposite(100);
        account.add();
        account.get_remaining_balance();
        System.out.println("expected result = "+1100);
    }
}
