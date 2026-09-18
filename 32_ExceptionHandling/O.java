class O {
    public static void main(String[] args) {
        System.out.println("Start");

        if(args.length > 0) {
            System.out.println(args[0]);
        } else {
            throw new LowBalanceException("Quaterly Acoount Balance must be 5000"); //checked -> Error
        }
        System.out.println("End");
    }
}
// O.java:8: error: unreported exception LowBalanceException; must be caught or declared to be thrown
//             throw new LowBalanceException("Quaterly Acoount Balance must be 5000"); //checked -> Error
//             ^
// 1 error

class LowBalanceException extends Exception {
    LowBalanceException() {

    }

    LowBalanceException(String s) {
        super(s);
    }
}