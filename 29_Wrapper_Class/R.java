class R {
    public static void main(String[] args) {
        byte a = Byte.parseByte("a2",16); //NumberFormatException as value is outside the range of byte

        System.out.println(a);
    }
}

// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"a2" Radix:16
//         at java.base/java.lang.Byte.parseByte(Byte.java:195)
//         at R.main(R.java:3)