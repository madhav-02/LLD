package payment;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public boolean pay(double amount){
        System.out.printf("Paid %.2f using CreditCard", amount);
        return true;
    }
}
