class J {
    public static void main(String[] args ) {
        Thread t = Thread.currentThread();

        ThreadGroup tg = t.getThreadGroup();
        System.out.println("Current Thread's Name : " + t.getName() + "- current thread resides in thread group : " + tg.getName());

        ThreadGroup systg = tg.getParent();
        System.out.println("Current Thread Group Name : " + tg.getName() + " - resides in Thread Group Name : " + systg.getName());
    }
}

// Current Thread's Name : main- current thread resides in thread group : main
// Current Thread Group Name : main - resides in Thread Group Name : system
