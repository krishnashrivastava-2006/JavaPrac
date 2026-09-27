//If Parent Thread is a Daemon Thread then child thread will also a Daemon Thread
class G {
    public static void main(String[] args) {
        G1Thread t = new G1Thread();
        t.setName("Bholu");
        t.setDaemon(true);
        t.start();

        Thread x = Thread.currentThread();
        for(int i = 0; i < 11; i++ ){
            System.out.println(i + " - " + x.getName() + " -  main()");
        }
    }
}

class G1Thread extends Thread {
    public void run() {
        G2Thread g = new G2Thread();
        g.setName("Golu");
        g.start();



        Thread t = Thread.currentThread();
        for(int i = 0; i < 100000; i++ ){
            System.out.println(i + " - " + t.getName());
        }
    }
}
class G2Thread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 0; i < 100000; i++ ){
            System.out.println(i + " - " + t.getName());
        }
    }
}
// 0 - Bholu
// 0 - main -  main()
// 1 - main -  main()
// 0 - Golu
// 2 - main -  main()
// 1 - Bholu
// 3 - main -  main()
// 1 - Golu
// 4 - main -  main()
// 2 - Bholu
// 3 - Bholu
// 4 - Bholu
// 5 - main -  main()
// 6 - main -  main()
// 7 - main -  main()
// 2 - Golu
// 8 - main -  main()
// 5 - Bholu
// 9 - main -  main()
// 3 - Golu
// 10 - main -  main()
// 6 - Bholu
// 4 - Golu
// 5 - Golu
// 7 - Bholu