class B1Thread extends Thread {
    public void run() {
        M.x.pro();
    }
}
class B2Thread extends Thread { 
    public void run() {
        M.x.info();
    }
}

class A1 {
    synchronized void pro() {
        Thread t = Thread.currentThread();
        for(int i = 0; i < 30; i++) {
            try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace(); }

            System.out.println(i + " - " + t.getName() + " -pro()");
        }
    }
    synchronized void info() {
        Thread t = Thread.currentThread();
        for(int i = 0; i < 30; i++) {
            try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace(); }

            System.out.println(i + " - " + t.getName() + " -info()");
        }
    }
}

class M {
    static A1 x = new A1();

    public static void main(String[] args) {
        B1Thread t1 = new B1Thread();
        B2Thread t2 = new B2Thread();

        t1.setName("A");
        t2.setName("B");

        t1.start();
        t2.start();
    }
}

// 0 - A -pro()
// 1 - A -pro()
// 2 - A -pro()
// 3 - A -pro()
// 4 - A -pro()
// 5 - A -pro()
// 6 - A -pro()
// 7 - A -pro()
// 8 - A -pro()
// 9 - A -pro()
// 10 - A -pro()
// 11 - A -pro()
// 12 - A -pro()
// 13 - A -pro()
// 14 - A -pro()
// 15 - A -pro()
// 16 - A -pro()
// 17 - A -pro()
// 18 - A -pro()
// 19 - A -pro()
// 20 - A -pro()
// 21 - A -pro()
// 22 - A -pro()
// 23 - A -pro()
// 24 - A -pro()
// 25 - A -pro()
// 26 - A -pro()
// 27 - A -pro()
// 28 - A -pro()
// 29 - A -pro()
// 0 - B -info()
// 1 - B -info()
// 2 - B -info()
// 3 - B -info()
// 4 - B -info()
// 5 - B -info()
// 6 - B -info()
// 7 - B -info()
// 8 - B -info()
// 9 - B -info()
// 10 - B -info()
// 11 - B -info()
// 12 - B -info()
// 13 - B -info()
// 14 - B -info()
// 15 - B -info()
// 16 - B -info()
// 17 - B -info()
// 18 - B -info()
// 19 - B -info()
// 20 - B -info()
// 21 - B -info()
// 22 - B -info()
// 23 - B -info()
// 24 - B -info()
// 25 - B -info()
// 26 - B -info()
// 27 - B -info()
// 28 - B -info()
// 29 - B -info()
