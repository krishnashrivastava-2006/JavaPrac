class RRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i = 0; i < 10; i++)
            System.out.println(i + " - " + x.getName() + " -run()");
    }
}

class R {
    public static void main(String[] args) {
        Thread thread = new Thread(new RRunnable(), "Nobita");
        thread.start();

        try { thread.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        //main thread will be temporary blocked(execution stopped) until the thread it joined i.e. Nobita is dissolved or dead
        //only then main thread will come out of blocked state to Runnable state
        //one thread remains blocked until the thread it joined becomes dead 
        System.out.println("------------------------------------");

        Thread x = Thread.currentThread();
        for(int i = 0; i < 10; i++)
            System.out.println(i + " - " + x.getName() + " -main()");
    }
}

// 0 - Nobita -run()
// 1 - Nobita -run()
// 2 - Nobita -run()
// 3 - Nobita -run()
// 4 - Nobita -run()
// 5 - Nobita -run()
// 6 - Nobita -run()
// 7 - Nobita -run()
// 8 - Nobita -run()
// 9 - Nobita -run()
// ------------------------------------
// 0 - main -main()
// 1 - main -main()
// 2 - main -main()
// 3 - main -main()
// 4 - main -main()
// 5 - main -main()
// 6 - main -main()
// 7 - main -main()
// 8 - main -main()
// 9 - main -main()