class R {
    public static void main(String[] args) {
        System.out.println("Step A");

        try {
            System.out.println("Step B");
            //Even though there is no line of code in try block
            //that can generate unchecked exception
            //we can still able to create catch block with unchecked type exception variable
        } catch(ArithmeticException e) {
            System.out.println("Step C");
        }

        System.out.println("Step D");
    }
}