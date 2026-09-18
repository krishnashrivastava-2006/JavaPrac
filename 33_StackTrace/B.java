class B {
    public static void main(String[] args) {
        aaa();
    }

    static void aaa() {
        bbb();
    }

    static void bbb() {
        ccc();
    }

    static void ccc() {
        int d = 7/0;
    }
}
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at B.ccc(B.java:15)
//         at B.bbb(B.java:11)
//         at B.aaa(B.java:7)
//         at B.main(B.java:3)