class FThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 10; i++)
            System.out.println(i + " " + x.getName() + " -run()");
    }
}

class F {
    public static void main(String[] args) {
        FThread a = new FThread();
        a.setName("Raju");
        a.start();

        FThread b = new FThread();
        b.setName("Kalu");
        b.start();

        Thread x = Thread.currentThread();
        for(int i = 0; i < 10; i++)
            System.out.println(i + " " + x.getName() + " -main()");
    }
}
//Three threads - Raju, Kalu, main

// 0 main -main()
// 0 Kalu -run()
// 1 Kalu -run()
// 0 Raju -run()
// 1 Raju -run()
// 2 Raju -run()
// 2 Kalu -run()
// 1 main -main()
// 3 Kalu -run()
// 3 Raju -run()
// 4 Raju -run()
// 5 Raju -run()
// 4 Kalu -run()
// 2 main -main()
// 5 Kalu -run()
// 6 Raju -run()
// 6 Kalu -run()
// 3 main -main()
// 7 Kalu -run()
// 8 Kalu -run()
// 9 Kalu -run()
// 7 Raju -run()
// 4 main -main()
// 5 main -main()
// 8 Raju -run()
// 6 main -main()
// 7 main -main()
// 9 Raju -run()
// 8 main -main()
// 9 main -main()