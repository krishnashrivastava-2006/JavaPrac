//NO frame memory is allocated for initialization block they are integral part of cnstructors

class H {
    {
        int y = 78/0;
    }

    public static void main(String[] args) {
        new H();
    }
}

// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at H.<init>(H.java:5)
//         at H.main(H.java:9)