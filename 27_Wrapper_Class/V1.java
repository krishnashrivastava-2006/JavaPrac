class V1 {
    public static void main(String[] args) {
        // short a = 32767; //ok -> error
        short a = 32768;  // not ok

        Short s = Short.valueOf(a);

        System.out.println(s);
    }
}