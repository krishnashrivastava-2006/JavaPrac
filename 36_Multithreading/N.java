class NRunnable implements Runnable {
    public void run() {
        try { Thread.sleep(5000); } catch(InterruptedException e) { e.printStackTrace(); }
        System.out.println(Thread.currentThread().getName() + "------------");
    }
}

class N {
    public static void main(String[] args) {
        Thread ct = Thread.currentThread();
        ThreadGroup tg = ct.getThreadGroup();
        
        NRunnable r = new NRunnable();

        Thread t1 = new Thread(r, "Bharat");
        Thread t2 = new Thread(r, "America");
        Thread t3 = new Thread(r, "Japan");
        Thread t4 = new Thread(r, "Canada");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("Current Thread Group Name : " + tg.getName());
        System.out.println("Current Thread Group Active Count : " + tg.activeCount());

        tg.list();
    }
}

// Current Thread Group Name : main
// Current Thread Group Active Count : 5
// java.lang.ThreadGroup[name=main,maxpri=10]
//     Thread[main,5,main]
//     Thread[Bharat,5,main]
//     Thread[America,5,main]
//     Thread[Japan,5,main]
//     Thread[Canada,5,main]
// Bharat------------
// Japan------------
// America------------
// Canada------------