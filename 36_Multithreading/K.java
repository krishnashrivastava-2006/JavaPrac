class K {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        ThreadGroup tg = t.getThreadGroup();
        System.out.println("Cuurent Thread Name : " + t.getName() + " - Current Thread resides in Thread Group Name : " + tg.getName());

        ThreadGroup tg1 = tg.getParent();
        System.out.println("Current Thread Group Name : " + tg.getName() + " - Cuurent Thread Group Parent Name : " + tg1.getName());

        ThreadGroup tg2 = tg1.getParent();
        System.out.println(tg1.getName() + " - Parent Thread is :" + tg2);
    }
}

// Cuurent Thread Name : main - Current Thread resides in Thread Group Name : main
// Current Thread Group Name : main - Cuurent Thread Group Parent Name : system
// system - Parent Thread is :null