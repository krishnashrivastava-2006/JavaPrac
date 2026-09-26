class AccountJ {
    int balance = 50;

    void withdraw(int amt) {
        if(balance >= amt){
            try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
            balance -= amt;
        }
    }

    int getBalance() {
        return balance;
    }
}