class Z {

    static Z a = new Z ();

    public static void main(String[] args) {
        new Thread(new Z1Runnable(), "J").start();
        new Thread(new Z2Runnable(), "K").start();
    }

    synchronized void pro() {
        Thread t = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - " + t.getName() + " -pro()");
        }
    }
}

class Z1Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        synchronized(Z.class) {
            for(int i =0 ; i < 30; i++) {
                System.out.println(i + " - " + t.getName() + " -run()");
            }
        }
    }
}

class Z2Runnable implements Runnable {
    public void run() {
        Z.a.pro();
    }
}

// 0 - K -pro()
// 1 - K -pro()
// 0 - J -run()
// 1 - J -run()
// 2 - K -pro()
// 2 - J -run()
// 3 - K -pro()
// 3 - J -run()
// 4 - J -run()
// 4 - K -pro()
// 5 - K -pro()
// 5 - J -run()
// 6 - J -run()
// 6 - K -pro()
// 7 - K -pro()
// 8 - K -pro()
// 9 - K -pro()
// 10 - K -pro()
// 11 - K -pro()
// 12 - K -pro()
// 7 - J -run()
// 8 - J -run()
// 9 - J -run()
// 10 - J -run()
// 11 - J -run()
// 13 - K -pro()
// 14 - K -pro()
// 15 - K -pro()
// 16 - K -pro()
// 12 - J -run()
// 13 - J -run()
// 14 - J -run()
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