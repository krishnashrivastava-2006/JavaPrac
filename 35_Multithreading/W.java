class W {
    static W w = new W();

    public static void main(String[] args) {
        new Thread(new W1Runnable(), "M").start();
        new Thread(new W2Runnable(), "N").start();
    }

    void aaa() {
        Thread t = Thread.currentThread();
        for(int i = 0; i < 30; i++) {
            synchronized(W.w) {
                System.out.println(i + " - " + t.getName() + " -aaa()");
            }
        }
    }
    void bbb() {
        Thread t = Thread.currentThread();
        for(int i = 0; i < 30; i++) {
            synchronized(W.w) {
                System.out.println(i + " - " + t.getName() + " -bbb()");
            }
        }
    }
}

class W1Runnable implements Runnable {
    public void run() {
        W.w.aaa();
    }
}
class W2Runnable implements Runnable {
    public void run() {
        W.w.bbb();
    }
}
// 0 - M -aaa()
// 1 - M -aaa()
// 2 - M -aaa()
// 3 - M -aaa()
// 4 - M -aaa()
// 5 - M -aaa()
// 6 - M -aaa()
// 7 - M -aaa()
// 8 - M -aaa()
// 9 - M -aaa()
// 10 - M -aaa()
// 11 - M -aaa()
// 12 - M -aaa()
// 13 - M -aaa()
// 14 - M -aaa()
// 15 - M -aaa()
// 16 - M -aaa()    
// 17 - M -aaa()
// 18 - M -aaa()
// 19 - M -aaa()
// 20 - M -aaa()
// 21 - M -aaa()
// 22 - M -aaa()
// 23 - M -aaa()
// 24 - M -aaa()
// 25 - M -aaa()
// 26 - M -aaa()
// 27 - M -aaa()
// 28 - M -aaa()
// 29 - M -aaa()
// 0 - N -bbb()
// 1 - N -bbb()
// 2 - N -bbb()
// 3 - N -bbb()
// 4 - N -bbb()
// 5 - N -bbb()
// 6 - N -bbb()
// 7 - N -bbb()
// 8 - N -bbb()
// 9 - N -bbb()
// 10 - N -bbb()
// 11 - N -bbb()
// 12 - N -bbb()
// 13 - N -bbb()
// 14 - N -bbb()
// 15 - N -bbb()
// 16 - N -bbb()
// 17 - N -bbb()
// 18 - N -bbb()
// 19 - N -bbb()
// 20 - N -bbb()
// 21 - N -bbb()
// 22 - N -bbb()
// 23 - N -bbb()
// 24 - N -bbb()
// 25 - N -bbb()
// 26 - N -bbb()
// 27 - N -bbb()
// 28 - N -bbb()
// 29 - N -bbb()