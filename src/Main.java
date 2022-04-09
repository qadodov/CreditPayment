public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int firstCredit = service.calculate(12);
        System.out.println(firstCredit);

        int secondCredit = service.calculate(24);
        System.out.println(secondCredit);

        int thirdCredit = service.calculate(36);
        System.out.println(thirdCredit);
    }
}
