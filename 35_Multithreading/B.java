class B {
    public static void main(String[] args) {
        B1Thread thread = new B1Thread();
        thread.setName("ABC");
        thread.setPriority(3);
        thread.start();

        Thread x = Thread.currentThread();
        System.out.println(x.getName() + " - Thread's Priority : " + x.getPriority()  + " - main()");
    }
}

class B1Thread extends Thread {
    public void run() {
        B2Thread thread = new B2Thread();
        thread.setName("BCD");
        thread.start();

        Thread x = Thread.currentThread();
        System.out.println(x.getName() + " - Thread's Priority : " + x.getPriority() + " - B1run()");

    }
}

class B2Thread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println(x.getName()  + " - Thread's Priority : " + x.getPriority()  +" - B2run()");

    }
}

// main - Thread's Priority : 5 - main()
// BCD - Thread's Priority : 3 - B2run()
// ABC - Thread's Priority : 3 - B1run()