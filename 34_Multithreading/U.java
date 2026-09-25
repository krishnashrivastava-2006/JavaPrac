import java.util.Date;

class U1 {
    public static void run() {
        Thread s = Thread.currentThread();

        for(int i = 0; i < 30 ; i++) {
            try {
                Thread.sleep(200);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " - " + s.getName() + " - " + "-run()");
        }
    }
}
class U {
    public static void main(String[] args) {
        Date a = new Date();
        U1.run();
        U1.run();
        U1.run();
        U1.run();
        Date b = new Date();
        System.out.println(((b.getTime() - a.getTime())/1000));
        // System.out.println();
    }
}