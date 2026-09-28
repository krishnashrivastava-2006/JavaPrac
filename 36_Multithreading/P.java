class PRunnable implements Runnable {
    public void run() {
        try { Thread.sleep(5000);} catch(InterruptedException e) { e.printStackTrace(); }
        System.out.println(Thread.currentThread().getName() + "--------------");
    }
}

class P {
    public static void main(String[] args) {
        Thread ct = Thread.currentThread();
        ThreadGroup tg = ct.getThreadGroup();

        ThreadGroup a = new ThreadGroup("QUAD");

        new Thread(a, new PRunnable(), "Bharat").start();
        new Thread(a, new PRunnable(), "America").start();
        new Thread(a, new PRunnable(), "Japan").start();
        new Thread(a, new PRunnable(), "China").start();

        tg.list();
    }
}

// java.lang.ThreadGroup[name=main,maxpri=10]
//     Thread[main,5,main]
//     java.lang.ThreadGroup[name=QUAD,maxpri=10]
//         Thread[Bharat,5,QUAD]
//         Thread[America,5,QUAD]
//         Thread[Japan,5,QUAD]
//         Thread[China,5,QUAD]
// America--------------
// Bharat--------------
// Japan--------------
// China--------------