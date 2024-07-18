package solidPrinciples;

public class JusPay implements PaymentGateway {

    // original method
    public String makePayment(int amount,
                              String expiry,
                              String cardNo,
                              int cvv,
                              int otp){
        return "SUCCESS";
    }

    // wrapped the original in our own structure
    @Override
    public int payment(String card, String expiry, int cvv, int otp, int amount) {
        String result = makePayment(amount, expiry, card, cvv, otp);
        if(result.equals("SUCCESS")){
            return 1;
        } else {
            return 0;
        }
    }
}
