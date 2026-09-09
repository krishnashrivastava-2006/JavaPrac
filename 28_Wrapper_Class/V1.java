class V1 {
    public static void main(String[] args) {
        aaa((byte)12);
        bbb((short)35);
        ccc((char)74);
    }

    static void aaa(Byte a) {
        System.out.println(a);
    }

    static void bbb(Short a) {
        System.out.println(a);
    }

    static void ccc(Character a){
        System.out.println(a);
    }
}