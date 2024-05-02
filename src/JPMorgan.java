import java.util.Currency;
import java.util.Date;
public class JPMorgan implements IBank, IInsuranceCompany {
    String name;
    String manager;
    String country;
    String address;
    double balance;
    Currency currency;

    public JPMorgan(String name, String manager, String country, String address, double balance, String currencyCode){
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
            double withdrawalAmount = value * 1;
            balance -= withdrawalAmount;
            System.out.println("Amount successfully withdrawn.");
            return true;
        }
    }
    @Override
    public boolean createInsurancePolicy(String name, int age) {
        System.out.println("Life insurance successfully processed!");
        return true;
    }
    @Override
    public boolean createInsurancePolicy(String carModel, int carID, int manufacturedYear){
        if (manufacturedYear < 2000) {
            System.out.println("Unauthorized insurance for the car manufactured in the year " + manufacturedYear + ".");
            return true;
        } else {
            System.out.println(" Car insurance successfully completed.");
            return true;
        }
    }
    @Override
    public boolean createInsurancePolicy(String passengerName, String origin, String destination, Date departureDate, Date returnDate){
        System.out.println(" Travel insurance successfully processed! ");
        return true;
    }
}



