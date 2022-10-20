package Library.howemork;

public class Tastersavingaccount {
    public static void main(String[] args) {
        Savingsaccount acc=new Savingsaccount(1000);
        acc.add_in();
        acc.getBalance();
        System.out.println("balance ="+1100);
    }
}
