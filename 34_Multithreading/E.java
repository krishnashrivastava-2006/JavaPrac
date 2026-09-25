class EThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 10; i++) 
            System.out.println(i + " " + x.getName() + " -run()");
    }
}

class E {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        EThread e = new EThread();
        e.setName("Golu");
        e.start();

        for(int i = 0; i < 10; i++)
            System.out.println(i + " " + x.getName() + " -main()");
    }
}
//two threads - main and Golu

// 0 main -main()
// 1 main -main()
// 0 Golu -run()
// 1 Golu -run()
// 2 Golu -run()
// 2 main -main()
// 3 Golu -run()
// 3 main -main()
// 4 main -main()
// 4 Golu -run()
// 5 Golu -run()
// 5 main -main()
// 6 main -main()
// 6 Golu -run()
// 7 main -main()
// 8 main -main()
// 7 Golu -run()
// 9 main -main()
// 8 Golu -run()
// 9 Golu -run()