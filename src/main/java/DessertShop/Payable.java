package DessertShop;

public interface Payable {
    // Enum for payment types
    enum PayType {
        CASH, CARD, PHONE;
    }

    // Getter for payment type
    PayType getPayType();

    // Setter for payment type
    void setPayType(PayType payType);
}// end of interface

