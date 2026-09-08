// valueOf(String) -> generated NumberFormatException if the String passed is :
//  Inparsable OR outside the range if specific datatype

class T {
    public static void main(String[] args) {
        Byte x = Byte.valueOf("169");

        // byte : -128 --- 0 --- 127
        // 169 > 127 hence NumberFormatException

    }
}

// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"169" Radix:10
//         at java.base/java.lang.Byte.parseByte(Byte.java:195)
//         at java.base/java.lang.Byte.valueOf(Byte.java:249)
//         at java.base/java.lang.Byte.valueOf(Byte.java:275)
//         at T.main(T.java:6)