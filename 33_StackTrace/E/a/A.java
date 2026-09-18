package a;
import b.B;

class A {
    public static void main(String[] args) {
        B.aaa();
    }
}

// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at d.D.ccc(D.java:5)
//         at c.C.bbb(C.java:6)
//         at b.B.aaa(B.java:6)
//         at a.A.main(A.java:6)