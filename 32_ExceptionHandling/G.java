class G {
    public static void main(String[] args) {
        //Checked Exceptions
        // Throwable x = new Throwable();    // error: unreported exception Throwable; must be caught or declared to be thrown
        // Exception x = new Exception();    //error: unreported exception Exception; must be caught or declared to be thrown

        //Unchecked Exceptions
        // ArithmeticException x = new ArithmeticException(); //ok
        RuntimeException x = new RuntimeException(); //ok

        throw x;
    }
}