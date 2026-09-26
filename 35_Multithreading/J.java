class J {
    static AccountJ account = new AccountJ();

    public static void main(String[] args) {
        new Thread(new TransactionRunnable(), "Mohan").start();
        new Thread(new TransactionRunnable(), "Sohan").start();
    }
}

class TransactionRunnable implements Runnable {
    public void run() {
        Thread t = new Thread();

        for(int i = 0; i < 5; i++) {
            System.out.println(i + " - " + t.getName() + " is going to withdraw Rs. 10");
            J.account.withdraw(10);
            System.out.println(i + " - " + t.getName() + " After withdrawing money : " + J.account.getBalance());
        }
    }
}

// 0 - Thread-1 is going to withdraw Rs. 10
// 0 - Thread-0 is going to withdraw Rs. 10
// 0 - Thread-1 After withdrawing money : 40
// 1 - Thread-1 is going to withdraw Rs. 10
// 0 - Thread-0 After withdrawing money : 30
// 1 - Thread-0 is going to withdraw Rs. 10
// 1 - Thread-1 After withdrawing money : 20
// 2 - Thread-1 is going to withdraw Rs. 10
// 1 - Thread-0 After withdrawing money : 10
// 2 - Thread-1 After withdrawing money : 0
// 3 - Thread-1 is going to withdraw Rs. 10
// 2 - Thread-0 is going to withdraw Rs. 10
// 2 - Thread-0 After withdrawing money : -20
// 3 - Thread-0 is going to withdraw Rs. 10
// 3 - Thread-1 After withdrawing money : -10
// 4 - Thread-1 is going to withdraw Rs. 10
// 3 - Thread-0 After withdrawing money : -30
// 4 - Thread-0 is going to withdraw Rs. 10
// 4 - Thread-1 After withdrawing money : -40
// 4 - Thread-0 After withdrawing money : -50