class A1Thread extends Thread {
    public void run() {
        S.q1.pro();
    }
}

class A2Thread extends Thread {
    public void run() {        
        S.q2.info();
    }
}

class S {
    static S q1 = new S();
    static S q2 = new S();
    public static void main(String[] args) {
        A1Thread a = new A1Thread();
        A2Thread b = new A2Thread();

        a.setName("A");
        b.setName("B");

        a.start();
        b.start();
    }   
    
    synchronized static void pro() {
        for(int i=0;i<30;i++) {
            Thread t = Thread.currentThread();
            System.out.println(i + " - " + t.getName());
        }
    }
    
    synchronized static void info() {
        for(int i=0;i<30;i++) {
            Thread t = Thread.currentThread();
            System.out.println(i + " - " + t.getName());
        }
    }
}