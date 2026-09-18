class L1 {
    public static void main(String[] args) {
        System.out.println("Start-------------------");


        if(args.length > 0)

            System.out.println(args[0]);
        else

            throw new MissingCommandLineArgumentException();



        System.out.println("End----------------------"); //not executed
    }
}
// Start-------------------
// Exception in thread "main" MissingCommandLineArgumentException
//         at L1.main(L1.java:11)

class MissingCommandLineArgumentException extends RuntimeException {

}