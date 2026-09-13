class T {
    public static void main(String[] args) {
        //problem generating code
        //if exception is thrown from outside try block then finally will not be executed
        //only if execution control has entered the try block then finally block runs
        try {   

        } catch(ArithmeticException e) {

        } finally {
            //Essential Code
        }
    }
}