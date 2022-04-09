public class CreditPaymentService {

    public int calculate(int months) {
        int amount = 1_000_000;
        double percent = 9.99;
        double monthPercent = percent / 100 / 12;
        double monthlyPayment = amount * (monthPercent + (monthPercent / (Math.pow(1 + monthPercent, months) - 1)));
        return (int) monthlyPayment;
    }
}
