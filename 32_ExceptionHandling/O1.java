class O1 {
    public static void main(String[] args) {
        System.out.println("Start");

        if(args.length > 0) {
            System.out.println(args[0]);
        } else {
            try {
                throw new LowBalanceException("Quaterly Acoount Balance must be 5000"); 
            } catch(LowBalanceException  e) {
                e.printStackTrace();
            }
        }
        System.out.println("End");
    }
}
// Start
// LowBalanceException: Quaterly Acoount Balance must be 5000
//         at O.main(O1.java:9)
// End

class LowBalanceException extends Exception {
    LowBalanceException() {

    }

    LowBalanceException(String s) {
        super(s);
    }
}