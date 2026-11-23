package payment;

public class UPIPayment implements PaymentStrategy{

    @Override
    public boolean pay(double amount){
        System.out.printf("Paid %.2f using UPI method%n", amount);
        return true;
    }
}
