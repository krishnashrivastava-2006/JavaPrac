class V {
    static V x = new V();
    static V y = new V();

    public static void main(String[] args) {
        new Thread(new V1Runnable(), "M").start();
        new Thread(new V2Runnable(), "N").start();
    }

    void aaa() {
        Thread a = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            synchronized(V.x) {
                System.out.println(i + " - " + a.getName() + " -aaa()");
            }
        }
    }

    void bbb() {
        Thread a = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            synchronized(V.y) {
                System.out.println(i + " - " + a.getName() + " -bbb()");
            }
        }
    }
}

class V1Runnable implements Runnable {
    public void run() {
        V.x.aaa();
    }
}

class V2Runnable implements Runnable {
    public void run() {
        V.y.bbb();
    }
}

// 0 - M -aaa()
// 1 - M -aaa()
// 0 - N -bbb()
// 1 - N -bbb()
// 2 - M -aaa()
// 3 - M -aaa()
// 2 - N -bbb()
// 4 - M -aaa()
// 5 - M -aaa()
// 3 - N -bbb()
// 4 - N -bbb()
// 5 - N -bbb()
// 6 - N -bbb()
// 7 - N -bbb()
// 8 - N -bbb()
// 6 - M -aaa()
// 7 - M -aaa()
// 8 - M -aaa()
// 9 - M -aaa()
// 9 - N -bbb()
// 10 - N -bbb()
// 11 - N -bbb()
// 12 - N -bbb()
// 10 - M -aaa()
// 11 - M -aaa()
// 13 - N -bbb()
// 14 - N -bbb()
// 12 - M -aaa()
// 13 - M -aaa()
// 14 - M -aaa()
// 15 - M -aaa()
// 15 - N -bbb()
// 16 - N -bbb()
// 17 - N -bbb()
// 18 - N -bbb()
// 16 - M -aaa()
// 17 - M -aaa()
// 19 - N -bbb()
// 20 - N -bbb()
// 18 - M -aaa()
// 19 - M -aaa()
// 21 - N -bbb()
// 22 - N -bbb()
// 23 - N -bbb()
// 20 - M -aaa()
// 21 - M -aaa()
// 22 - M -aaa()
// 24 - N -bbb()
// 23 - M -aaa()
// 24 - M -aaa()
// 25 - N -bbb()
// 25 - M -aaa()
// 26 - M -aaa()
// 26 - N -bbb()
// 27 - N -bbb()
// 28 - N -bbb()
// 27 - M -aaa()
// 28 - M -aaa()
// 29 - N -bbb()
// 29 - M -aaa()