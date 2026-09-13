class S {
    public static void main(String[] args) {
        try {


        } catch(ArithmeticException e) {

        //So to overcome this problem we have finally block
        } finally {
            //Essential Code

            //If execution control has entered the try block
            //the finally block will definately run
            //even if exception occur or not

            //rule: execution control entered the corresponding tryb block then it will run
        }
    }
}