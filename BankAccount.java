package Library.howemork;

public class BankAccount {
    private double balance;

   public void Setdeposite(double amount)
   {
       balance=balance+amount;
   }

    public void setwithdraws(double amount) {
        balance = balance-amount;
    }

    public void get_remaining_balance() {
        System.out.println(balance);
    }
    public void add()
    {
        double rate =((balance*10)/100);
                balance=balance+rate;
    }

}

