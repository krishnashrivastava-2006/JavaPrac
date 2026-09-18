class A {
    public static void main(String[] args) {
        System.out.println("Start");

        int z = 90/0;

        System.out.println("End");
    }
}

// Start
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at A.main(A.java:5)