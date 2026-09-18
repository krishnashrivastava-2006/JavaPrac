class L2 {
    public static void main(String[] args) {
        System.out.println("Start-----------");

        if(args.length > 0)
            System.out.println(args[0]);
        else   
            try {
                throw new MissingCommandLineArgumentException();
            } catch(MissingCommandLineArgumentException e) {
                e.printStackTrace();
            }

        System.out.println("End-------------"); //executed
    }
}
// Start-----------
// MissingCommandLineArgumentException
//         at L2.main(L2.java:9)
// End-------------