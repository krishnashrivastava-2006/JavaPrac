class X {
    static {
        int y = 2 / 0;
    }
}

class Y {
    void yyy() {
        X x = new X();
        for(int i=0;i<1000000000;i++);
    }
}

class Z {
    Z() {
        new Y().yyy();
    }
}

class J extends Z {
    public static void main(String[] args) {
        new J();
    }    
}



// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at X.<clinit>(J.java:3)
//         at Y.yyy(J.java:9)
//         at Z.<init>(J.java:16)
//         at J.<init>(J.java:20)
//         at J.main(J.java:22)