class O {
    static O x = new O();
    static O y = new O();

    public static void main(String[] args) {
        new Thread(new O1Runnable(), "A").start();
        new Thread(new O2Runnable(), "B").start();
    }

    synchronized void pro(int i) {
        Thread x = Thread.currentThread();
        System.out.println(i + " - " + x.getName() + " -pro()");
    }

    synchronized void info(int i) {
        Thread x = Thread.currentThread();
        System.out.println(i + " - " + x.getName() + " -info()");
        // System.out.println("-------------");
    }
}

class O1Runnable implements Runnable {
    public void run() {
        for(int i = 0; i < 30; i++) {
            O.x.pro(i);
        }
    }
}
class O2Runnable implements Runnable {
    public void run() {
        for(int i = 0; i < 30; i++) {
            O.y.info(i);
        }
    }
}

// 0 - B -info()
// 1 - B -info()
// 2 - B -info()
// 0 - A -pro()
// 3 - B -info()
// 1 - A -pro()
// 4 - B -info()
// 5 - B -info()
// 2 - A -pro()
// 3 - A -pro()
// 6 - B -info()
// 7 - B -info()
// 4 - A -pro()
// 5 - A -pro()
// 8 - B -info()
// 9 - B -info()
// 6 - A -pro()
// 10 - B -info()
// 7 - A -pro()
// 11 - B -info()
// 8 - A -pro()
// 12 - B -info()
// 9 - A -pro()
// 13 - B -info()
// 10 - A -pro()
// 11 - A -pro()
// 14 - B -info()
// 15 - B -info()
// 12 - A -pro()
// 13 - A -pro()
// 14 - A -pro()
// 16 - B -info()
// 15 - A -pro()
// 17 - B -info()
// 16 - A -pro()
// 17 - A -pro()
// 18 - B -info()
// 18 - A -pro()
// 19 - B -info()
// 19 - A -pro()
// 20 - B -info()
// 21 - B -info()
// 20 - A -pro()
// 21 - A -pro()
// 22 - B -info()
// 23 - B -info()
// 22 - A -pro()
// 23 - A -pro()
// 24 - B -info()
// 25 - B -info()
// 24 - A -pro()
// 25 - A -pro()
// 26 - B -info()
// 26 - A -pro()
// 27 - A -pro()
// 27 - B -info()
// 28 - B -info()
// 28 - A -pro()
// 29 - A -pro()
// 29 - B -info()

