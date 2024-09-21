package Enma.StrategyPattern;

public class OnlineStore {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();


        PaymentStrategy creditCardPayment = new CreditCardPayment("345699", "Enma Ramírez", "12/25", "123");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.processPayment(180.0);


        PaymentStrategy paypalPayment = new PayPalPayment("enma25leticia@gmail.com", "contraseña123");
        paymentContext.setPaymentStrategy(paypalPayment);
        paymentContext.processPayment(85.5);


        PaymentStrategy cryptoPayment = new CryptoPayment("2345790");
        paymentContext.setPaymentStrategy(cryptoPayment);
        paymentContext.processPayment(600.0);
    }
}
