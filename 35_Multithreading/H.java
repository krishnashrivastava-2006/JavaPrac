class HRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        
        for(int i=0;i<30;i++) {
            if(x.getName().equals("B") && (i > 3 && i < 8)) {
                Thread.yield();
                System.out.println(x.getName() + " ---- yielding..." + i);
            } 
            
            System.out.println(i + " - " + x.getName());
        }
    }
}

class H {
    public static void main(String[] args) {
        HRunnable r = new HRunnable();

        Thread a = new Thread(r, "A");
        Thread b = new Thread(r, "B");
        Thread c = new Thread(r, "C");

        a.start();
        b.start();
        c.start();
    }    
}