class T {
    public static void main(String[] args) {
        Thread thread = new Thread(new T1Runnable(), "Nobita");
        thread.start();

        try { thread.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        System.out.println("-------------------------------");
        
        Thread x = Thread.currentThread();
        

        for(int i = 0; i < 10; i++) {
            System.out.println(i + " - " + x.getName() + " -main()");
        }
    }
}

class T1Runnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        Thread thread = new Thread(new T2Runnable(), "Jiyan");
        thread.start();


        try { thread.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        System.out.println("-------------------------------");

        for(int i = 0; i < 10; i++) {
            System.out.println(i + " - " + x.getName() + " -run()");
        }
    }
}

class T2Runnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 10; i++) {
            System.out.println(i + " - " + x.getName() + " -run()");
        }
    }
}

// 0 - Jiyan -run()
// 1 - Jiyan -run()
// 2 - Jiyan -run()
// 3 - Jiyan -run()
// 4 - Jiyan -run()
// 5 - Jiyan -run()
// 6 - Jiyan -run()
// 7 - Jiyan -run()
// 8 - Jiyan -run()
// 9 - Jiyan -run()
// -------------------------------
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
// -------------------------------
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