package Virtual_Vending_Machine;


    // Represents a customer using the vending machine
    public class Customer implements CoinInterface, BalanceInterface {

        private int balance;

        // Constructor
        public Customer() {

            this.balance = 0;

        }

        //Method to insert coins and add to balance
        @Override
        public void insertCoin(Coin coin) {

            balance += coin.getValue();
            System.out.println("Inserted: Rs-" + coin.getValue() + " | Current balance: Rs-" + balance);

        }

        // method to get balance
        @Override
        public int getBalance() {
            return balance;
        }

        public void deductBalance(int amount) {


            if(balance >= amount){

                balance -= amount;

            }

        }
    }