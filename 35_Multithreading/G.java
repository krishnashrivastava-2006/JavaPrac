class GRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i = 0; i < 10; i++)
            System.out.println(i + " - " + x.getName() + " run()");
    }
}
//Our Operating System doesnot suport it
// we ave ti rent Batch operating system from Oracle
class G {
    public static void main(String[] args) {
        GRunnable r = new GRunnable();

        Thread a = new Thread(r, "A");
        Thread b = new Thread(r, "B");
        Thread c = new Thread(r, "C");

        a.setPriority(3);
        b.setPriority(5);
        c.setPriority(8);

        a.start();
        b.start();
        c.start();
    }
}

// 0 - A run()
// 1 - A run()
// 2 - A run()
// 3 - A run()
// 4 - A run()
// 5 - A run()
// 6 - A run()
// 7 - A run()
// 8 - A run()
// 9 - A run()
// 0 - B run()
// 1 - B run()
// 0 - C run()
// 1 - C run()
// 2 - B run()
// 2 - C run()
// 3 - C run()
// 3 - B run()
// 4 - C run()
// 5 - C run()
// 4 - B run()
// 5 - B run()
// 6 - C run()
// 6 - B run()
// 7 - C run()
// 7 - B run()
// 8 - B run()
// 8 - C run()
// 9 - B run()
// 9 - C run()