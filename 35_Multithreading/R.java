class A1Thread extends Thread {
    public void run() {
        for(int i=0;i<30;i++)
            R.q1.pro(i);
    }
}

class A2Thread extends Thread {
    public void run() {        
        for(int i=0;i<30;i++) {
            R.q2.info(i);
        }
    }
}

class R {
    static R q1 = new R();
    static R q2 = new R();
    public static void main(String[] args) {
        A1Thread a = new A1Thread();
        A2Thread b = new A2Thread();

        a.setName("A");
        b.setName("B");

        a.start();
        b.start();
    }   
    
    synchronized static void pro(int i) {
        Thread t = Thread.currentThread();
        System.out.println(i + " - " + t.getName());
    }
    
    synchronized static void info(int i) {
        Thread t = Thread.currentThread();
        System.out.println(i + " - " + t.getName());
    }
}