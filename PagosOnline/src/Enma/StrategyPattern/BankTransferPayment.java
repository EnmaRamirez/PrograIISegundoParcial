package Enma.StrategyPattern;

public class BankTransferPayment implements PaymentStrategy{
    private String bankAccount;
    private String swiftCode;

    public BankTransferPayment(String bankAccount, String swiftCode) {
        this.bankAccount = bankAccount;
        this.swiftCode = swiftCode;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago por transferencia bancaria por: $" + amount);

    }
}
