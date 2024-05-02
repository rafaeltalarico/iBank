public class Main {
    public static void main(String[] args) {
        // Cria um banco Santander
        IBank santander = new Santander("Santander", "João", "Brasil", "123 Main St.", 100000.0, "BRL");

        // Cria um banco JPMorgan
        JPMorgan jpmorgan = new JPMorgan("JPMorgan", "Alice", "Brasil", "456 Wall St.", 150000.0, "BRL");

        // Cria um cartão de crédito Visa
        Visa visaCard = new Visa("Alice", jpmorgan, 5000.0); // Note que agora é um objeto Visa

        // Gera um número de cartão Visa e exibe o limite de crédito
        String visaCardNumber = visaCard.generateCreditCardNumber();
        double visaCreditLimit = visaCard.grantCreditLimit(visaCard.getMonthlyIncome());

        // Imprime as informações dos bancos e do cartão de crédito
        System.out.println("Banco Santander:");
        // System.out.println("Saldo inicial: " + santander.getBalance());
        santander.deposit(5000.0);
        System.out.println("Depósito no Santander: 5000.0");


        System.out.println("Banco JPMorgan:");
        // System.out.println("Saldo inicial: " + jpmorgan.getBalance());
        jpmorgan.deposit(10000.0);
        System.out.println("Depósito no JPMorgan: 10000.0");
        // System.out.println("Novo saldo do JPMorgan: " + jpmorgan.getBalance());

        System.out.println("\nCartão de Crédito Visa:");
        System.out.println("Número do cartão Visa: " + visaCardNumber);
        System.out.println("Limite de crédito Visa: " + visaCreditLimit);

        // Usando a interface IInsuranceCompany
        jpmorgan.createInsurancePolicy("Alice", 30);
    }
}
