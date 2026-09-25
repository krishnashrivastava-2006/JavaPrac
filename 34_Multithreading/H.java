class HThread extends Thread {
    public void run(int nj) { //we did method overloading not overriding so parent class method version will run in thread and since it is empty nothing will be executed

        Thread x = Thread.currentThread();
        for(int i = 0; i < 439; i++) {
            System.out.println(i +  " " +x.getName() + " -run()");   // will not be executed
        }
    }
}

class H {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        HThread h = new HThread();
        h.setName("Kartik");
        h.start();

        for(int i = 0; i < 10; i++) {
            System.out.println(i + " " + x.getName() + " " + x.getId() + " - main()");
        }
    }
}
// 0 main 1 - main()
// 1 main 1 - main()
// 2 main 1 - main()
// 3 main 1 - main()
// 4 main 1 - main()
// 5 main 1 - main()
// 6 main 1 - main()
// 7 main 1 - main()
// 8 main 1 - main()
// 9 main 1 - main()