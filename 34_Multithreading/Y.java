class YThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++)
            System.out.println(i + " - " + x.getName() + " - run()");
    }
}

class Y {
    public static void main(String[] args) {
        YThread t = new YThread();
        t.setName("Nobita");
        t.start();

        try { t.join(18); } catch(InterruptedException e) { e.printStackTrace(); } 
        // main thread will remain blocked only for 18 milliseconds and wait onlt this time for other thread to complete its job
        // else after 18 millisecnd it will com out of blocked state to runnable state
        // however if other thread is dead before 18 millisecons them even tho 18 milliseconds is not completedthe main thread will come out of blocked state
                

        System.out.println("\n\n+++++++++++++++++++\n");

        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++)
            System.out.println(i + " - " + x.getName() + " - main()");
    }    
}