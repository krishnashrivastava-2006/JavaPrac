class X {
    static X x = new X();

    void aaa() {
        Thread x = Thread.currentThread();

        synchronized(X.x) {
            for(int i = 0; i < 30; i++)
                System.out.println(i + " - " + x.getName() + " -aaa()");
        }
    }

    void bbb() {
        Thread x = Thread.currentThread();

        synchronized(X.x) {
            for(int i = 0; i < 30; i++)
                System.out.println(i + " - " + x.getName() + " -bbb()");
        }
    }

    public static void main(String[] args) {
        new Thread(new X1Runnable(), "A").start();
        new Thread(new X2Runnable(), "B").start();
    }
}

class X1Runnable implements Runnable {
    public void run() {
        X.x.aaa();
    }
}
class X2Runnable implements Runnable {
    public void run() {
        X.x.bbb();
    }
}

// 0 - A -aaa()
// 1 - A -aaa()
// 2 - A -aaa()
// 3 - A -aaa()
// 4 - A -aaa()
// 5 - A -aaa()
// 6 - A -aaa()
// 7 - A -aaa()
// 8 - A -aaa()
// 9 - A -aaa()
// 10 - A -aaa()
// 11 - A -aaa()
// 12 - A -aaa()
// 13 - A -aaa()
// 14 - A -aaa()
// 15 - A -aaa()
// 16 - A -aaa()
// 17 - A -aaa()
// 18 - A -aaa()
// 19 - A -aaa()
// 20 - A -aaa()
// 21 - A -aaa()
// 22 - A -aaa()
// 23 - A -aaa()
// 24 - A -aaa()
// 25 - A -aaa()
// 26 - A -aaa()
// 27 - A -aaa()
// 28 - A -aaa()
// 29 - A -aaa()
// 0 - B -bbb()
// 1 - B -bbb()
// 2 - B -bbb()
// 3 - B -bbb()
// 4 - B -bbb()
// 5 - B -bbb()
// 6 - B -bbb()
// 7 - B -bbb()
// 8 - B -bbb()
// 9 - B -bbb()
// 10 - B -bbb()
// 11 - B -bbb()
// 12 - B -bbb()
// 13 - B -bbb()
// 14 - B -bbb()
// 15 - B -bbb()
// 16 - B -bbb()
// 17 - B -bbb()
// 18 - B -bbb()
// 19 - B -bbb()
// 20 - B -bbb()
// 21 - B -bbb()
// 22 - B -bbb()
// 23 - B -bbb()
// 24 - B -bbb()
// 25 - B -bbb()
// 26 - B -bbb()
// 27 - B -bbb()
// 28 - B -bbb()
// 29 - B -bbb()