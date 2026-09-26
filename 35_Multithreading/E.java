class E {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println(t.getName() + " - Thread's Priority : " + t.getPriority());

        t.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t.getName() + " - Thread's Priority : " + t.getPriority());
    }
}

// main - Thread's Priority : 5
// main - Thread's Priority : 1