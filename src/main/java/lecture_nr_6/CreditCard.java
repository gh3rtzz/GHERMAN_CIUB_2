package lecture_nr_6;

public class CreditCard {

    private String cardNumber;
    private String expiryDate;
    private String CVV;

    public CreditCard(String cardNumber, String expiryDate, String CVV) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.CVV = CVV;
    }

    //1234 5678 9123 4567
    //**** **** **** 4567
    public String getCardNumber() {
        return hideCardNumber();
    }

    private String hideCardNumber(){
        String returnString = "************";
        returnString += cardNumber.substring(12, 16);
        return returnString;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
