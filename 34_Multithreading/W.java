// Mutual Dependency Freeze
// Circular join
//Interlocking join
// threads are permanently blocked
//Deadlock condition

class WRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            if(i == 15) {
                try {W.x.join();} catch(InterruptedException e){}
            }
            System.out.println(i + " - " + x.getName() + " -run()");
        }
    }
}

class W {
    static Thread x;
    public static void main(String[] args) {
        x = Thread.currentThread();

        Thread thread = new Thread(new WRunnable(), "Jiyan");
        thread.start();

        try { thread.join(); } catch(InterruptedException e) {}
        System.out.println("+++++++++++++++++++++++++++++");

        for(int i = 0; i < 30; i++)
            System.out.println(i + " - " + x.getName() + " -main()");


    }
}