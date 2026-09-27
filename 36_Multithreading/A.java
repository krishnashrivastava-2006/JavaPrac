class A1Runnable implements Runnable{
    public void run() {
        A.a2.info();
    }
}
class A2Runnable implements Runnable{
    public void run() {
        A.a1.pro();
    }
}

//DeadLock Situation

class A {   
    static A a1 = new A();
    static A a2 = new A();

    public static void main(String[] args) {
        new Thread(new A1Runnable(), "Mohan").start();
        new Thread(new A2Runnable(), "Sohan").start();
    }

    static synchronized void pro() {
        Thread x = Thread.currentThread();
        try { Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
        A.a1.info();
        for(int i = 0 ; i < 30; i++) {
            System.out.println(i + " - " + x.getName() + " -pro()");
        }
        
    }

    static synchronized void info() {
        Thread x = Thread.currentThread();
        try {Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }

        A.a2.pro();
        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - " + x.getName() + " -info()");
        }
    }

}