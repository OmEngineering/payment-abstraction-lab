package LiskovSubstitutionPrinciple.ProblematicCode;

public class RuPayCard extends CreditCard {
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of RUPAY CARD");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of RUPAY CARD");
    }

    @Override
    public void swipAndPay() {
        System.out.println("Swip and Pay impl of RUPAY CARD");
    }

    @Override
    public void mandatePayment() {
        System.out.println("Mandate Payment impl of RUPAY CARD");
    }
}
