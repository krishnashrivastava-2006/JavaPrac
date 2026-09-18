class C {
    public static void main(String[] args) {
        C1.aaa();
    }
}

class C1 {
    static void aaa() {
        C2.bbb();
    }
}

class C2 {
    static void bbb() {
        C3.ccc();
    }
}

class C3 {
    static void ccc() {
        C4.ddd();
    }
}

class C4 {
    static void ddd() {
        int x = 893/0;
    }
}

// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at C4.ddd(C.java:27)
//         at C3.ccc(C.java:21)
//         at C2.bbb(C.java:15)
//         at C1.aaa(C.java:9)
//         at C.main(C.java:3)