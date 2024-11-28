package Virtual_Vending_Machine;

    //Represents a product in the vending machine
    public class Product implements ProductQuantity {

        private String name;
        private int price;
        private int quantity;


        // Constructor to initialize the private fields
        public Product(String name, int price, int quantity){

            this.name = name;            // Initializing private field
            this.price = price;          // Initializing private field
            this.quantity = quantity;    // Initializing private field

        }

        //Getter Method
        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }


        //Method to reduce quantity by one after a purchase
        @Override
        public void reduceQuantity() {

            if (quantity > 0){

                quantity --;

            }

        }

        //Method to check if the product is available
        @Override
        public boolean isAvailable() {

            return quantity > 0;

        }
    }

