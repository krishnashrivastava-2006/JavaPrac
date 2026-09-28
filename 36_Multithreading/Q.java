class QRunnable implements Runnable {
    public void run() {
        try { Thread.sleep(5000);} catch(InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + " ------------------");
    }
}

class Q {
    public static void main(String[] args) {
        Thread ct = Thread.currentThread();
        ThreadGroup tg = ct.getThreadGroup();

        ThreadGroup systg = tg.getParent();

        ThreadGroup aa = new ThreadGroup(systg, "QUAD");

        new Thread(aa, new QRunnable(), "Bharat").start();
        new Thread(aa, new QRunnable(), "America").start();
        new Thread(aa, new QRunnable(), "Japan").start();
        new Thread(aa, new QRunnable(), "China").start();

        tg.list();
        System.out.println("==============================================");
        systg.list();
    }
}

// java.lang.ThreadGroup[name=system,maxpri=10]
//     Thread[Reference Handler,10,system]
//     Thread[Finalizer,8,system]
//     Thread[Signal Dispatcher,9,system]
//     Thread[Attach Listener,5,system]
//     Thread[Notification Thread,9,system]
//     java.lang.ThreadGroup[name=main,maxpri=10]
//         Thread[main,5,main]
//     java.lang.ThreadGroup[name=InnocuousThreadGroup,maxpri=10]
//         Thread[Common-Cleaner,8,InnocuousThreadGroup]
//     java.lang.ThreadGroup[name=QUAD,maxpri=10]
//         Thread[Bharat,5,QUAD]
//         Thread[America,5,QUAD]
//         Thread[Japan,5,QUAD]
//         Thread[China,5,QUAD]
// Japan ------------------
// Bharat ------------------
// China ------------------
// America ------------------
