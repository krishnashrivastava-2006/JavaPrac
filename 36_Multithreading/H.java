//We have to explicity make child thread non Daemon else if parent is Daemon thread it will also be a Daemon Thread

class H {
    public static void main(String[] args) {
        Thread t = new Thread(new H1Runnable(), "Bholu");
        t.setDaemon(true);
        t.start();

        Thread x = Thread.currentThread();
        for(int i = 0; i < 8; i++) {
            System.out.println(i + " - " + x.getName() + " - main()");
        }
    }
}
class H1Runnable implements Runnable {
    public void run() {
        Thread t = new Thread(new H2Runnable(), "Golu");
        t.setDaemon(false);
        t.start();

        Thread x = Thread.currentThread();
        for(int i = 0; i < 10000000; i++ ) {
            System.out.println(i + " - " + x.getName() + " - run()");
        }
    }
}
class H2Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i = 0 ; i < 30; i++) {
            System.out.println(i + " - " + t.getName() + " - run()");
        }
    }
}
// 0 - Golu - run()
// 0 - Bholu - run()
// 1 - Bholu - run()
// 0 - main - main()
// 2 - Bholu - run()
// 1 - Golu - run()
// 3 - Bholu - run()
// 1 - main - main()
// 2 - main - main()
// 4 - Bholu - run()
// 2 - Golu - run()
// 5 - Bholu - run()
// 3 - main - main()
// 4 - main - main()
// 5 - main - main()
// 6 - main - main()
// 6 - Bholu - run()
// 3 - Golu - run()
// 7 - Bholu - run()
// 7 - main - main()
// 8 - Bholu - run()
// 4 - Golu - run()
// 5 - Golu - run()
// 9 - Bholu - run()
// 6 - Golu - run()
// 7 - Golu - run()
// 10 - Bholu - run()
// 11 - Bholu - run()
// 8 - Golu - run()
// 9 - Golu - run()
// 12 - Bholu - run()
// 13 - Bholu - run()
// 10 - Golu - run()
// 14 - Bholu - run()
// 15 - Bholu - run()
// 11 - Golu - run()
// 12 - Golu - run()
// 16 - Bholu - run()
// 13 - Golu - run()
// 14 - Golu - run()
// 17 - Bholu - run()
// 18 - Bholu - run()
// 15 - Golu - run()
// 16 - Golu - run()
// 19 - Bholu - run()
// 20 - Bholu - run()
// 21 - Bholu - run()
// 22 - Bholu - run()
// 23 - Bholu - run()
// 17 - Golu - run()
// 18 - Golu - run()
// 19 - Golu - run()
// 24 - Bholu - run()
// 25 - Bholu - run()
// 20 - Golu - run()
// 26 - Bholu - run()
// 27 - Bholu - run()
// 21 - Golu - run()
// 22 - Golu - run()
// 28 - Bholu - run()
// 29 - Bholu - run()
// 23 - Golu - run()
// 24 - Golu - run()
// 30 - Bholu - run()
// 25 - Golu - run()
// 26 - Golu - run()
// 27 - Golu - run()
// 31 - Bholu - run()
// 32 - Bholu - run()
// 33 - Bholu - run()
// 28 - Golu - run()
// 29 - Golu - run()
// 34 - Bholu - run()
// 35 - Bholu - run()
// 36 - Bholu - run()
// 37 - Bholu - run()