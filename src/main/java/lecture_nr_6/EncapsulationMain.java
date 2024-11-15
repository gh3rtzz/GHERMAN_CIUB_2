package lecture_nr_6;

public class EncapsulationMain {

    public String publicString;
    protected String protectedString;
    String defaultString;
    private String privateString;

    public static void main(String[] args) {

        CreditCard cc1 = new CreditCard("1234567891231111", "01/24", "123");

//        System.out.println(cc1.cardNumber);
//        System.out.println(cc1.expiryDate);
////        System.out.println(cc1.CVV); WON'T COMPILE
//
//        cc1.publicMethod();
////        cc1.privateMethod();  WON'T COMPILE

        System.out.println(cc1.getCardNumber());

        cc1.setCardNumber("1234123412341234");
        System.out.println(cc1.getCardNumber());

//        cc1.hideCardNumber();

    }
}
