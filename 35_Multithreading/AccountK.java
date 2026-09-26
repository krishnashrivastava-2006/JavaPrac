//Synchronization when race condition is arised amd data is inconsistenly modified
class AccountK {
    private int balance = 50;

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int amt) {
        if(balance >= amt){
            try {Thread.sleep(100); } catch(InterruptedException e) {}
            balance -= amt;
        }
    }
}