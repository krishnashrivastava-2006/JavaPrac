class I {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println(t); //Thread[main,5,main]

        ThreadGroup tg = t.getThreadGroup();

        
        System.out.println("Current Thread name : " + t.getName() + " resides in Thread Group named : " + tg.getName());
        // Current Thread name : main resides in Thread Group named : main
    }
}