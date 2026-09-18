class M {
    public static void main(String[] args) {
        System.out.println("Start---------");

        if(args.length > 0) {
            System.out.println(args[0]);
        } else {
            try {
                throw new MissingCommandLineArgumentException("Some argument is expected");
            } catch(MissingCommandLineArgumentException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

        System.out.println("End-----------");
    }
}

// Start---------
// MissingCommandLineArgumentException: Some argument is expected
//         at M.main(M.java:9)
// Some argument is expected
// End-----------

class MissingCommandLineArgumentException extends RuntimeException {
    MissingCommandLineArgumentException(){}
    MissingCommandLineArgumentException(String s) {
        super(s);
    }
}