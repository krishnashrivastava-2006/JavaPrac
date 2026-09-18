class S {
    public static void main(String[] args) {
        pro();
    }

    static void pro() {
        try {
            throw new ArithmeticException();
        } catch(ArithmeticException e) {
            throw new NullPointerException(); //it will not executed immediately as method will pop and finally block has to be run as execution control entered the try block
        } finally {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}

// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
//         at S.pro(S.java:12)
//         at S.main(S.java:3)
