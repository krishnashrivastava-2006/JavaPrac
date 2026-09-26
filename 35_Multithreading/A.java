class AThread extends Thread {
    public void run() {

    }
}

class A {
    public static void main(String[] args) {
        AThread a = new AThread();
        a.setName("Golu");
        a.start();

        System.out.println(a.getName() + " - " + a.getPriority() + " - Thread's Priority ");

        Thread x = Thread.currentThread();

        System.out.println(x.getName() + " - " + x.getPriority() + " - Thread's Priority ");

    }
}

// main thread is parent thread of golu thread
// child thread priority is same as parent
// Golu - 5 - Thread's Priority
// main - 5 - Thread's Priority