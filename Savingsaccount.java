package Library.howemork;

public class Savingsaccount {
    private double balance,interest;

    public Savingsaccount(double intel_balance) {

        balance = intel_balance;
        interest=((balance*10)/100);
    }
    public void add_in()
    {
        balance=balance+interest;
    }

    public void getBalance() {
        System.out.println(balance);
    }
}
