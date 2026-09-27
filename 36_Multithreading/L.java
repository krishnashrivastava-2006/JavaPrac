class L {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        ThreadGroup tg = t.getThreadGroup();

        new Thread(new LRunnable(), "America").start();
        new Thread(new LRunnable(), "Bharat").start();
        new Thread(new LRunnable(), "Japan").start();
        new Thread(new LRunnable(), "Korea").start();

        System.out.println("Current Thread Group Name : " + tg.getName());
        System.out.println("Current Thread Group's Active Count : " + tg.activeCount());
    }
}

class LRunnable implements Runnable {
    public void run() {
        try { Thread.sleep(5000); } catch(InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + "----------");
    }
}

// Current Thread Group Name : main
// Current Thread Group's Active Count : 5
// Japan----------
// Bharat----------
// Korea----------
// America----------