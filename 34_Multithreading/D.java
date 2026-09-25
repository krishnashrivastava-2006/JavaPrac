class D {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        for(int i = 1; i < 10; i++) {
            System.out.println(i + " " + x.getName() + " -main()");
        }

        process();
    }

    static void process() {
        Thread x = Thread.currentThread();

        for(int i = 1; i < 10; i++) {
            System.out.println(i + " " + x.getName() + " -process()");
        }
    }
}
//single thread - main

// 1 main -main()
// 2 main -main()
// 3 main -main()
// 4 main -main()
// 5 main -main()
// 6 main -main()
// 7 main -main()
// 8 main -main()
// 9 main -main()
// 1 main -process()
// 2 main -process()
// 3 main -process()
// 4 main -process()
// 5 main -process()
// 6 main -process()
// 7 main -process()
// 8 main -process()
// 9 main -process()