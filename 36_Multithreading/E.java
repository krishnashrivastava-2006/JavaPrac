class E {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println(t.isDaemon()); //false
    }
}