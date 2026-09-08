class W1 {
    public static void main(String[] args) {
        Short j = Short.valueOf("32767"); //no exception

        //short : -32768 --- 0 --- 32767

        System.out.println(j);
    }
}