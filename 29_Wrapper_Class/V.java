class V {
    public static void main(String[] args) {
        String a = Integer.toString(352,2);
        String b = Integer.toBinaryString(352);

        String c = Integer.toString(4552,16);
        String d = Integer.toHexString(4552);

        System.out.println(a);
        System.out.println(b);
        System.out.println(b == a);
       
        System.out.println(c);
        System.out.println(d);
        System.out.println(c == d);
    }
}
// 101100000
// 101100000
// false