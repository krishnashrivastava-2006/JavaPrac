class U1Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            try {Thread.sleep(10); } catch(InterruptedException e) {}
            synchronized(U.u) {
                System.out.println(i + " - " + t.getName());
            }
        }
    }
}
class U2Runnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            try {Thread.sleep(10); } catch(InterruptedException e) {}
            synchronized(U.u) {
                System.out.println(i + " - " + t.getName());
            }
        }
    }
}

class U {
    static U u = new U();

    public static void main(String[] args) {
        new Thread(new U1Runnable(), "A").start();
        new Thread(new U2Runnable(), "B").start();
    }
}