class B {
    public static void main(String[] args) {
        new Thread(new B1Runnable(), "Golu").start();
        new Thread(new B2Runnable(), "Bholu").start();
    }
}
//DeadLock Situation

class B1Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            synchronized(X1.class) {
                try {Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
                synchronized(X2.class) {
                    System.out.println(i + " - " + t.getName());
                }
            }
        }
    }
}
class B2Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 0; i < 30; i++) {
            synchronized(X2.class) {
            try{ Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
            synchronized(X1.class) {
                System.out.println(i + " - " + t.getName());
            }
        }
        }
    }
}

class X1{}
class X2{}