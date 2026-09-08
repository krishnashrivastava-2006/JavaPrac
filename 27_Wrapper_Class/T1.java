class T1 {
    public static void main(String[] args) {
        Byte a = Byte.valueOf("127"); //No exception
        // as 127 lies in the range

        System.out.println(a); 
    }
}