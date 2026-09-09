class T {
    public static void main(String[] args) {
        int  n = 35;

        //Error :
        // Byte x = n;
        // Short y = n;
        // Character z = n;

        //Type Casting
        Byte x = (byte)n;
        Short y = (short)n;
        Character z = (char)n;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}