package Virtual_Vending_Machine;

    //representing various rupees values.
    public enum Coin {

    TEN(10), TWENTY(20), THIRTY(30), FOURTY(40), FIFTY(50);

    // Field to store the value of each constant
    private int value;

    // Constructor to initialize the value for each constant
    Coin(int value){

        this.value = value;

    }

    // Getter method to access the value of each enum constant
    public int getValue(){

        return value;

    }

}
