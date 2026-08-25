package LiskovSubstitutionPrinciple.ProblematicCode;

public class VisaCard extends CreditCard {
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of VISA");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online transfer impl of VISA");
    }

    @Override
    public void swipAndPay() {
        System.out.println("Swip and pay impl of VISA");
    }

    @Override
    public void mandatePayment() {
        System.out.println("MandatePayment impl of VISA");
    }
}
