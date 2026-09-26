class L {
    static AccountL account = new AccountL();

    public static void main(String[] args) {
        new Thread(new TransactionRunnable(), "Mohan").start();
        new Thread(new TransactionRunnable(), "Sohan").start();
    }
}

class TransactionRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i = 0; i < 5 ; i++) {
            System.out.println(i + " - " + t.getName() + " is going to withdraw Rs.10");
            if(L.account.getBalance() >= 10) {
                try { Thread.sleep(1000); } catch(InterruptedException e) {} // bina lock liye sleep pe chale gaya

                L.account.withdraw(10);
            }
            System.out.println(i + " - "  + t.getName() + " after withdrawing balance is :" + L.account.getBalance());

        }
    }
}