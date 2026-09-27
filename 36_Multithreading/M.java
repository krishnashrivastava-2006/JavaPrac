class M {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        ThreadGroup tg = t.getThreadGroup();

        new Thread(new MRunnable(), "America").start();
        new Thread(new MRunnable(), "Bharat").start();
        new Thread(new MRunnable(), "Japan").start();
        new Thread(new MRunnable(), "Korea").start();

        System.out.println("Current Thread Group Name : " + tg.getName());
        System.out.println("Current Thread Group's Active Count : " + tg.activeCount());

        try { Thread.sleep(7000); } catch(InterruptedException e) {}


        System.out.println("Current Thread Group Name : " + tg.getName());
        System.out.println("Current Thread Group's Active Count : " + tg.activeCount());
    }
}
// Current Thread Group Name : main
// Current Thread Group's Active Count : 5
// America----------
// Bharat----------
// Japan----------
// Korea----------
// Current Thread Group Name : main
// Current Thread Group's Active Count : 1

class MRunnable implements Runnable {
    public void run() {
        try { Thread.sleep(5000); } catch(InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + "----------");
    }
}