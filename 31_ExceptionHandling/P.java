class P {
    public static void main(String[] args) {
        System.out.println("Step A");
        
        //compiler never forces you to handle it using try-catch or declarartion
        throw new ArithmeticException("kuch toh gadbad hai..."); //=> Unchecked Exception
    }
}
// Step A
// Exception in thread "main" java.lang.ArithmeticException: kuch toh gadbad hai...
//         at P.main(P.java:6)