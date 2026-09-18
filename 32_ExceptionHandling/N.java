class N {
    public static void main(String[] args) {
        // int x = 23/0;

        throw new ArithmeticException("Mera Khudka Message");
    }
}

// Exception in thread "main" java.lang.ArithmeticException: Mera Khudka Message
//         at N.main(N.java:5)