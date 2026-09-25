class ORunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            if(i == 15) {
                try { Thread.sleep(1000);} catch(InterruptedException e) { e.printStackTrace();}
            }
            System.out.println(i + " - " + x.getName() + " -run()");
        }
    }
}

class O {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        Thread thread = new Thread(new ORunnable(), "Ram");
        thread.start();

        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - " + x.getName() + " -main()");
        }
    }
}


// 0 - Ram -run()
// 1 - Ram -run()
// 0 - main -main()
// 1 - main -main()
// 2 - Ram -run()
// 3 - Ram -run()
// 2 - main -main()
// 3 - main -main()
// 4 - Ram -run()
// 5 - Ram -run()
// 6 - Ram -run()
// 4 - main -main()
// 5 - main -main()
// 6 - main -main()
// 7 - Ram -run()
// 8 - Ram -run()
// 7 - main -main()
// 8 - main -main()
// 9 - Ram -run()
// 10 - Ram -run()
// 9 - main -main()
// 10 - main -main()
// 11 - Ram -run()
// 12 - Ram -run()
// 11 - main -main()
// 13 - Ram -run()
// 14 - Ram -run()
// 12 - main -main()
// 13 - main -main()
// 14 - main -main()
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
// 15 - Ram -run()
// 16 - Ram -run()
// 17 - Ram -run()
// 18 - Ram -run()
// 19 - Ram -run()
// 20 - Ram -run()
// 21 - Ram -run()
// 22 - Ram -run()
// 23 - Ram -run()
// 24 - Ram -run()
// 25 - Ram -run()
// 26 - Ram -run()
// 27 - Ram -run()
// 28 - Ram -run()
// 29 - Ram -run()