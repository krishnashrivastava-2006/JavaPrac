class F {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println(t.getName() + " - Thread's Priority : " + t.getPriority());

        t.setPriority(11);

        System.out.println(t.getName() + " - Thread's Priority : " + t.getPriority());
    }
}

// main - Thread's Priority : 5
// Exception in thread "main" java.lang.IllegalArgumentException
//         at java.base/java.lang.Thread.setPriority(Thread.java:1149)
//         at F.main(F.java:7)
