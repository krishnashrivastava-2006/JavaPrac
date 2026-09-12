class E {
    public static void main(String[] args) {
        System.out.println("-------Start--------");

        try {
            //problem generating code
            int y = 12/0;
        } catch (ArithmeticException e) {
            System.out.println("Problem Solved"); //Solution if exception occurs -> only executed if corresponding try block generates exception
        }

        System.out.println("--------End---------");
    }
}

// -------Start--------
// Problem Solved
// --------End---------