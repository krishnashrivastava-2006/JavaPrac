class Circle {
    private int radius = 0;

    public synchronized void writeRadius() {
        Thread t = Thread.currentThread();

        if(radius != 0 ){
            try { wait(); } catch(InterruptedException e) { e.printStackTrace();}
        } else {
            
            System.out.print(t.getName() + " - Enter Radius : ");
            this.radius = C.sc.nextInt();
            notify();
        }
    }

    public synchronized void readRadius() {
        Thread t = Thread.currentThread();
        if(radius == 0) {
            try { wait(); } catch(InterruptedException e) { e.printStackTrace(); }
        } else {
            System.out.println(t.getName() + " - Read Radius : " + radius);
            this.radius = 0;
            notify();
        }
    }
}