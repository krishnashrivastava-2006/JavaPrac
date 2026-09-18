class G {
    G() {
        int f = 78/0;
    }
}

class G1 extends G {

}

class G2 extends G1 {
    
}

class G3 extends G2 {

}

class G4 extends G3 {
    public static void main(String[] args) {
        new G4();
    }
}

// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at G.<init>(G.java:3)
//         at G1.<init>(G.java:7)
//         at G2.<init>(G.java:11)
//         at G3.<init>(G.java:15)
//         at G4.<init>(G.java:19)
//         at G4.main(G.java:21)