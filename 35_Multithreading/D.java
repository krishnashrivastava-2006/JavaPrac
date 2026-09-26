class D {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println(t.getName() + " - Thread's Priority : " + t.getPriority());

        t.setPriority(MIN_PRIORITY);

        System.out.println(t.getName() + " - Thread's Priority : " + t.getPriority());
    }
}

// D.java:7: error: cannot find symbol
//         t.setPriority(MIN_PRIORITY);
//                       ^
//   symbol:   variable MIN_PRIORITY
//   location: class D
// 1 error