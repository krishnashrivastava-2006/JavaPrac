class GThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println(x.getName() + " " + " -run()");
    }
}


class G {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        GThread g = new GThread();
        g.setName("Bholu"); // we didnot cal the start() method so no new thread of execution will be created and since we are calling
        // the run() method it will run in the main thread 
        g.run();

        System.out.println(x.getName() + " " + " -main()");

    }
}

// main  -run()
// main  -main()