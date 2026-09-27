class FThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i = 0; i < 10000000; i++) {
            System.out.println(i + " - " + x.getName() + " -run()");
        }
    }
}
//Daemon Thread is for assiting important threads when important threads complete their job and dissolved
// then evern though Daemon thread job is not completed but it also gets dissolved

class F {
    public static void main(String[] args) {
        FThread t = new FThread();
        t.setName("Golu");
        t.setDaemon(true);
        t.start();

        Thread x = Thread.currentThread();
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " - " + x.getName() + " -main()");
        }
    }
}
// 0 - Golu -run()
// 1 - Golu -run()
// 0 - main -main()
// 1 - main -main()
// 2 - Golu -run()
// 2 - main -main()
// 3 - main -main()
// 3 - Golu -run()
// 4 - Golu -run()
// 4 - main -main()
// 5 - main -main()
// 5 - Golu -run()
// 6 - Golu -run()
// 6 - main -main()
// 7 - main -main()
// 7 - Golu -run()
// 8 - Golu -run()
// 8 - main -main()
// 9 - main -main()
// 9 - Golu -run()
// 10 - Golu -run()
// 11 - Golu -run()
// 12 - Golu -run()
// 13 - Golu -run()