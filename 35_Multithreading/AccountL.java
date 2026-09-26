class AccountL {
    private int balance = 50;

    public synchronized void withdraw(int amt) {
        balance -= amt;
    }

    public synchronized int getBalance() {
        return balance;
    }
}