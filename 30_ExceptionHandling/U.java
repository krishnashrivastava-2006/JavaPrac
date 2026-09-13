class U {
    public static void main(String[] args) {
        System.out.println("Start");

        try {
            pro();
            //problem generating code
        } catch(StackOverflowError e) {
            System.out.println("Problem solved");
            System.out.println(e);
        } finally {
            System.out.println("Essential code");            
        }

        System.out.println("End");
    }
    static void pro(){
        pro();
    }
}
// D:\JavaPrac_2\30_ExceptionHandling>java U
// Start
// Problem solved
// java.lang.StackOverflowError
// Essential code
// End