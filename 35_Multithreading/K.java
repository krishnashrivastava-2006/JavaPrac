class K {
    static AccountK account = new AccountK();

    public static void main(String[] args) {
        new Thread(new TransactionRunnable(), "Mohan").start();
        new Thread(new TransactionRunnable(), "Sohan").start();
    }
}

class TransactionRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i = 0; i < 5; i ++) {
            System.out.println(i + " - " + t.getName() + " is Going to withdraw Rs. 10");
            K.account.withdraw(10);
            System.out.println(i + " - " + t.getName() + " After withdrawing money the balance is : " + K.account.getBalance()); 
        }
    }
}