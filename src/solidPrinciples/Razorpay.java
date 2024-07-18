package solidPrinciples;

public class Razorpay implements PaymentGateway {

    // original
    public int doPayment(
            String cardNo,
            String expiry,
            int cvv,
            int otp,
            int amount){
        return 0;
        // 0 - failure
        // 1 - success
        // 2 - in progress
    }

    // wrapped the original in our own structure
    @Override
    public int payment(String card, String expiry, int cvv, int otp, int amount) {
        int result = doPayment(card, expiry, cvv, otp, amount);
        return result;
    }
}
