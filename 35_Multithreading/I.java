class I {
    static Account account = new Account();

    public static void main(String[] args) {
        Thread t1 = new Thread(new TransactionRunnable(), "Mohan");
        Thread t2 = new Thread(new TransactionRunnable(), "Sohan");

        t1.start();
        t2.start();
    }
}

class TransactionRunnable implements Runnable {
    public void run() {
        Thread thread = new Thread();

        for(int i = 0; i < 5; i ++) {
            System.out.println(i + " - " + thread.getName() + " is going to withdraw Rs. 10 ");
            I.account.withdraw(10);
            System.out.println(i + " - " + thread.getName() + " balance after withdrawing money : " + I.account.getBalance());
        }
    }
}

// 0 - Thread-0 is going to withdraw Rs. 10
// 0 - Thread-1 is going to withdraw Rs. 10
// 0 - Thread-0 balance after withdrawing money : 40
// 1 - Thread-0 is going to withdraw Rs. 10
// 0 - Thread-1 balance after withdrawing money : 30
// 1 - Thread-1 is going to withdraw Rs. 10
// 1 - Thread-0 balance after withdrawing money : 20
// 2 - Thread-0 is going to withdraw Rs. 10
// 2 - Thread-0 balance after withdrawing money : 0
// 1 - Thread-1 balance after withdrawing money : 10
// 2 - Thread-1 is going to withdraw Rs. 10
// 3 - Thread-0 is going to withdraw Rs. 10
// 3 - Thread-0 balance after withdrawing money : -20
// 2 - Thread-1 balance after withdrawing money : -10
// 3 - Thread-1 is going to withdraw Rs. 10
// 3 - Thread-1 balance after withdrawing money : -30
// 4 - Thread-0 is going to withdraw Rs. 10
// 4 - Thread-0 balance after withdrawing money : -40
// 4 - Thread-1 is going to withdraw Rs. 10
// 4 - Thread-1 balance after withdrawing money : -50