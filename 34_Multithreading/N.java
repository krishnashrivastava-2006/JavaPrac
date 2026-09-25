//constructor - > Thread(Runnable, String)

class NRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 15; i++) {
            System.out.println(i + " - " + x.getName() + " -run()");
        }
    }
}

class N {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        Thread thread = new Thread(new NRunnable(), "Kaliya");
        // thread.setName()
        thread.start();

        for(int i = 0; i < 15; i++) {
            System.out.println(i + " - " + x.getName() + " -main()");
        }
    }
}
// 0 - main -main()
// 1 - main -main()
// 0 - Kaliya -run()
// 1 - Kaliya -run()
// 2 - main -main()
// 3 - main -main()
// 2 - Kaliya -run()
// 4 - main -main()
// 5 - main -main()
// 6 - main -main()
// 7 - main -main()
// 8 - main -main()
// 9 - main -main()
// 3 - Kaliya -run()
// 4 - Kaliya -run()
// 10 - main -main()
// 11 - main -main()
// 12 - main -main()
// 5 - Kaliya -run()
// 6 - Kaliya -run()
// 7 - Kaliya -run()
// 13 - main -main()
// 14 - main -main()
// 8 - Kaliya -run()
// 9 - Kaliya -run()
// 10 - Kaliya -run()
// 11 - Kaliya -run()
// 12 - Kaliya -run()
// 13 - Kaliya -run()
// 14 - Kaliya -run()