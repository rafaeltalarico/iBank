import java.util.Random;
public class CreditCard {
    String ownerName;
    IBank bank;
    double monthlyIncome;
    double limit;
    String number;
    double balance;

    public CreditCard(String ownerName, IBank bank, double monthlyIncome){
        this.ownerName = ownerName;
        this.bank = bank;
        this.monthlyIncome = monthlyIncome;
        this.limit = grantCreditLimit(monthlyIncome);
        this.number = generateCreditCardNumber();
        this.balance = 0.0;
    }

    public String generateCreditCardNumber(){
        StringBuilder cardNumber = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            int digit = random.nextInt(10);
            cardNumber.append(digit);
        }
        return cardNumber.toString();
    }
    public double grantCreditLimit(double monthlyIncome){
        return monthlyIncome * 3;
    }
    public double getMonthlyIncome() {
        return this.monthlyIncome;
    }
}
