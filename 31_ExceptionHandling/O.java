class O {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException,NumberFormatException,NullPointerException
        // these exceptions are unchecked exceptions and they remain unchecked at compile time
        // the compiler never forces you to handle them using try catch or declare in method signature
        //It will compile without any error

        int[] x = {2,3,4,5};
        System.out.println(x[4]); //ArrayIndexOutOfBoundsException

        String s = null;
        System.out.println(s.length()); //NullPointerException

        Integer z = Integer.valueOf("golu"); //NumberFormatException
    }
}