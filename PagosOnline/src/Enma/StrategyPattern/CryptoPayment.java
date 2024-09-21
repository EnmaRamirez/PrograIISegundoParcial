package Enma.StrategyPattern;

public class CryptoPayment implements PaymentStrategy{
    private String  walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println(walletAddress + " Procesando pago de criptomonedas por: $" + amount + "$");

    }
}
