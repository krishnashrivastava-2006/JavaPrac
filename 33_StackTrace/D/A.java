class A {
    public static void main(String[] args) {
        B.aaa();
    }
}

// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at D.ccc(D.java:3)
//         at C.bbb(C.java:3)
//         at B.aaa(B.java:3)
//         at A.main(A.java:3)