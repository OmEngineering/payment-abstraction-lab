package LiskovSubstitutionPrinciple.ProblematicCode;

public abstract class CreditCard {

    private String ccNumber;

    private String ownerName;

    private int cvv;

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCcNumber() {
        return this.ccNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getCvv() {
        return this.cvv;
    }

    public abstract void tapAndPay();

    public abstract void onlineTransfer();

    public abstract void swipAndPay();

    public abstract void mandatePayment();

    public void displayCreditCardDetails() {
        System.out.println("CC Number" + this.ccNumber + ", With Owner Name: " + this.ownerName);
    }

}