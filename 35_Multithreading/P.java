class B1Runnable implements Runnable {
    public void run() {
        for(int i = 0; i < 30; i++){
            P.x.info(i);
        }
    }
}
class B2Runnable implements Runnable {
    public void run() {
        for(int i = 0; i < 30; i++){
            P.y.info(i);
        }
    }
}

class P {
    static P x = new P();
    static P y = new P();

    public static void main(String[] args) {
        new Thread(new B1Runnable(), "M").start();
        new Thread(new B2Runnable(), "N").start();
    }

    synchronized void info(int i) {
        Thread t = Thread.currentThread();

        System.out.println(i + " - " + t.getName() + " -info()");
    }
}