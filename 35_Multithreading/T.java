class A1Thread extends Thread {
    public void run() {
        T.t.pro();
    }
}

class A2Thread extends Thread {
    public void run() {
        T.t.info();
    }
}

class T {
    static T t = new T();

    public static void main(String[] args) {
        A1Thread t1 = new A1Thread();
        A2Thread t2 = new A2Thread();

        t1.setName("M");
        t2.setName("N");
        
        t1.start();
        t2.start();
    }

    synchronized void pro() {
        Thread x = Thread.currentThread();
        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - " + x.getName() + " -pro()");
        }
    }
    synchronized void info() {
        Thread x = Thread.currentThread();
        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - " + x.getName() + " -info()");
        }
    }
}
// 0 - M -pro()
// 1 - M -pro()
// 2 - M -pro()
// 3 - M -pro()
// 4 - M -pro()
// 5 - M -pro()
// 6 - M -pro()
// 7 - M -pro()
// 8 - M -pro()
// 9 - M -pro()
// 10 - M -pro()
// 11 - M -pro()
// 12 - M -pro()
// 13 - M -pro()
// 14 - M -pro()
// 15 - M -pro()
// 16 - M -pro()
// 17 - M -pro()
// 18 - M -pro()
// 19 - M -pro()
// 20 - M -pro()
// 21 - M -pro()
// 22 - M -pro()
// 23 - M -pro()
// 24 - M -pro()
// 25 - M -pro()
// 26 - M -pro()
// 27 - M -pro()
// 28 - M -pro()
// 29 - M -pro()
// 0 - N -info()
// 1 - N -info()
// 2 - N -info()
// 3 - N -info()
// 4 - N -info()
// 5 - N -info()
// 6 - N -info()
// 7 - N -info()
// 8 - N -info()
// 9 - N -info()
// 10 - N -info()
// 11 - N -info()
// 12 - N -info()
// 13 - N -info()
// 14 - N -info()
// 15 - N -info()
// 16 - N -info()
// 17 - N -info()
// 18 - N -info()
// 19 - N -info()
// 20 - N -info()
// 21 - N -info()
// 22 - N -info()
// 23 - N -info()
// 24 - N -info()
// 25 - N -info()
// 26 - N -info()
// 27 - N -info()
// 28 - N -info()
// 29 - N -info()