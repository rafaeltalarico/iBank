import java.util.Currency;
public class Santander implements IBank {
    String name;
    String manager;
    String country;
    String address;
    double balance;
    Currency currency;

    public Santander(String name, String manager, String country, String address, double balance, String currencyCode) {
        this.name = name;
        this.manager = manager;
        this.country = country;
        this.address = address;
        this.balance = balance;
        this.currency = Currency.getInstance(currencyCode);
    }

    @Override
    public double deposit(double value) {
        balance += value;
        return balance;

    }

    @Override
    public boolean withdraw(double value) {
        if (value > balance) {
            System.out.println("Insufficient funds!");
            return false;
        } else {
            balance -= value;
            System.out.println("Amount successfully withdrawn.");
            return true;
        }
    }

}
