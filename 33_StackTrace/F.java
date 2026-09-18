class F {
    public static void main(String[] args) {
        new F(true);
    }

    F(boolean b) {
        this("om");
    }

    F(String s) {
        this();
    }

    F() {
        int s = 28/0;
    }
}

// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at F.<init>(F.java:15)
//         at F.<init>(F.java:11)
//         at F.<init>(F.java:7)
//         at F.main(F.java:3)