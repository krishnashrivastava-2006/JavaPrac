class Account {
    int balance = 50;

    void withdraw(int amount) {
        balance -= amount;
    }

    int getBalance() {
        return balance;
    }
}