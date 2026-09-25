//Standardized Way of creating threads without violating designing principles
class M {
    public static void main(String[] args) {
        Thread a = Thread.currentThread();
        MThread m = new MThread();

        Thread x = new Thread(m);
        x.setName("Raju");
        x.start();

        for(int i = 0; i < 10; i++)
            System.out.println(i + " - " + a.getName() + " - " + " -main()");
    }
}

class MThread implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 10; i++) 
            System.out.println(i + " - " + x.getName() + " - " + " -run()");

    }
}
// 0 - main -  -main()
// 1 - main -  -main()
// 0 - Raju -  -run()
// 1 - Raju -  -run()
// 2 - main -  -main()
// 3 - main -  -main()
// 2 - Raju -  -run()
// 3 - Raju -  -run()
// 4 - main -  -main()
// 4 - Raju -  -run()
// 5 - Raju -  -run()
// 5 - main -  -main()
// 6 - main -  -main()
// 6 - Raju -  -run()
// 7 - Raju -  -run()
// 7 - main -  -main()
// 8 - Raju -  -run()
// 9 - Raju -  -run()
// 8 - main -  -main()
// 9 - main -  -main()