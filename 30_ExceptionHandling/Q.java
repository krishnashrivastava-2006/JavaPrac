class Q {
    public static void main(String[] args) {
        try {



        } catch(ArithmeticException e) {

            //Essential Code
            //If we write it here and the exception is never generated inside try block
            //then again this essential code will no be generated
            //hence we cannot write it inside catch block too
        }
    }
}