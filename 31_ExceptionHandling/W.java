//Exception Propagation

class W {
    public static void main(String[] args) {
        aaa();
    }

    static void aaa() {
        System.out.println("A"); //executed
        bbb(); //-> exception
        System.out.println("B"); //not executed
    }
    static void bbb() {
        System.out.println("C"); //executed
        ccc();  //<- exception 
        System.out.println("D"); //not executed
    }
    static void ccc() {
        System.out.println("E"); //executed
        ddd(); // <- exception
        System.out.println("F"); // not executed
    }
    static void ddd() {
        System.out.println("G"); //executed
        int c = 24/0; // Here exception is originated 
        System.out.println("H"); //not execute
    }
}

// A
// C
// E
// G
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at W.ddd(W.java:25)
//         at W.ccc(W.java:20)
//         at W.bbb(W.java:15)
//         at W.aaa(W.java:10)
//         at W.main(W.java:5)