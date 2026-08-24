package LiskovSubstitutionPrinciple.ProblematicCode;

public class MasterCard extends CreditCard {
    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay impl of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online transfer impl of MasterCard");
    }

    @Override
    public void swipAndPay() {
        System.out.println("Swip and Pay impl of MasterCard");
    }

    @Override
    public void mandatePayment() {
        System.out.println("Mandate Payment impl of MasterCard");
    }
}
