class Y {
    public static void main(String[] args) {
        Y1Thread t1 = new Y1Thread();
        Y2Thread t2 = new Y2Thread();
        
        t1.setName("J");
        t2.setName("K");

        t1.start();
        t2.start();
    }

    synchronized static void pro() {
        Thread t = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - " + t.getName() + " -pro()");
        }
    }
}

class Y1Thread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        synchronized(Y.class) {
            for(int i = 0; i < 30; i++) {
                System.out.println(i + " - " + t.getName() + " -run()");
            }
        }
    }
}

class Y2Thread extends Thread {
    public void run() {
        Y.pro();
    }
}

// 0 - J -run()
// 1 - J -run()
// 2 - J -run()
// 3 - J -run()
// 4 - J -run()
// 5 - J -run()
// 6 - J -run()
// 7 - J -run()
// 8 - J -run()
// 9 - J -run()
// 10 - J -run()
// 11 - J -run()
// 12 - J -run()
// 13 - J -run()
// 14 - J -run()
// 15 - J -run()
// 16 - J -run()
// 17 - J -run()
// 18 - J -run()
// 19 - J -run()
// 20 - J -run()
// 21 - J -run()
// 22 - J -run()
// 23 - J -run()
// 24 - J -run()
// 25 - J -run()
// 26 - J -run()
// 27 - J -run()
// 28 - J -run()
// 29 - J -run()
// 0 - K -pro()
// 1 - K -pro()
// 2 - K -pro()
// 3 - K -pro()
// 4 - K -pro()
// 5 - K -pro()
// 6 - K -pro()
// 7 - K -pro()
// 8 - K -pro()
// 9 - K -pro()
// 10 - K -pro()
// 11 - K -pro()
// 12 - K -pro()
// 13 - K -pro()
// 14 - K -pro()
// 15 - K -pro()
// 16 - K -pro()
// 17 - K -pro()
// 18 - K -pro()
// 19 - K -pro()
// 20 - K -pro()
// 21 - K -pro()
// 22 - K -pro()
// 23 - K -pro()
// 24 - K -pro()
// 25 - K -pro()
// 26 - K -pro()
// 27 - K -pro()
// 28 - K -pro()
// 29 - K -pro()