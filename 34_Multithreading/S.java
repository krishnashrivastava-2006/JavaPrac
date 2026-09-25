class SRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++)
            System.out.println(i + " - " + x.getName() + " -run()");
    }
}

class S {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SRunnable(), "Jiyan");
        thread.start();

        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            if( i== 15) 
                thread.join(); //main thread gets blocked when i == 15 it will remain blocked until jiyan thread is dead

            System.out.println(i + " - " + x.getName() + " -main()");
        }
        
    }
}

// 0 - main -main()
// 1 - main -main()
// 2 - main -main()
// 3 - main -main()
// 0 - Jiyan -run()
// 1 - Jiyan -run()
// 4 - main -main()
// 2 - Jiyan -run()
// 3 - Jiyan -run()
// 5 - main -main()
// 6 - main -main()
// 4 - Jiyan -run()
// 5 - Jiyan -run()
// 7 - main -main()
// 8 - main -main()
// 6 - Jiyan -run()
// 7 - Jiyan -run()
// 8 - Jiyan -run()
// 9 - main -main()
// 10 - main -main()
// 9 - Jiyan -run()
// 10 - Jiyan -run()
// 11 - main -main()
// 11 - Jiyan -run()
// 12 - Jiyan -run()
// 12 - main -main()
// 13 - main -main()
// 13 - Jiyan -run()
// 14 - Jiyan -run()
// 15 - Jiyan -run()
// 14 - main -main()
// 16 - Jiyan -run()
// 17 - Jiyan -run()
// 18 - Jiyan -run()
// 19 - Jiyan -run()
// 20 - Jiyan -run()
// 21 - Jiyan -run()
// 22 - Jiyan -run()
// 23 - Jiyan -run()
// 24 - Jiyan -run()
// 25 - Jiyan -run()
// 26 - Jiyan -run()
// 27 - Jiyan -run()
// 28 - Jiyan -run()
// 29 - Jiyan -run()
// 15 - main -main()
// 16 - main -main()
// 17 - main -main()
// 18 - main -main()
// 19 - main -main()
// 20 - main -main()
// 21 - main -main()
// 22 - main -main()
// 23 - main -main()
// 24 - main -main()
// 25 - main -main()
// 26 - main -main()
// 27 - main -main()
// 28 - main -main()
// 29 - main -main()