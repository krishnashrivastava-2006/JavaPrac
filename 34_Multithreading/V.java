import java.util.Date;

class VRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++) {
            try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
            System.out.println(i + " - " + x.getName() + " - run()");
        }
    } 
} 

class V {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        VRunnable r = new VRunnable();

        Thread a = new Thread(r, "ChotaBheem");
        Thread b = new Thread(r, "Kaliya");
        Thread c = new Thread(r, "Raju");
        
        Date t1 = new Date();
        a.start();
        b.start();
        c.start();

        try {
            a.join();
            b.join();
            c.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        Date t2 = new Date();

        System.out.println((t2.getTime() - t1.getTime())/1000);
    }    
}