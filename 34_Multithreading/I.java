class I {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        x.start(); //we are calling start methid on already alive thread
        // so an exception will arise at run timw i.e. IllegalThreadStateException -> Unchecked

        for(int i = 0; i < 10; i++) {
            System.out.println(i + " " + x.getName() + " -main()");
        }
    }
}
// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:802)
//         at I.main(I.java:5)