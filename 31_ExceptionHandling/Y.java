class Y {
    public static void main(String[] args) {
        aaa();
    }

    static void aaa() {
        System.out.println("A");
        bbb();
        System.out.println("B");
    }
    static void bbb() {
        System.out.println("C");
        try {
            ccc(); //handled 
        } catch(ArithmeticException e) {
            System.out.println("Problem Solved");
        }
        System.out.println("D");
    }
    static void ccc() {
        System.out.println("E");
        ddd(); // exception arises
        System.out.println("F"); //not executed
    }
    static void ddd() {
        System.out.println("G");
        int x = 35/0; //-> exception generated
        System.out.println("H"); //not executed 
    }
}
// A
// C
// E
// G
//Problem Solved
// D
// B