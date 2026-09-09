class Y {
    public static void main(String[] args) {

    }

    static Byte aaa() {
        int a = 2;
        return a; //error as we are returning non constant
    }

    static Short bbb() {
        int b = 35;
        return b; //error
    }
    static Character ccc() {
        int c = 24;
        return c; //error
    }
}
// Y.java:8: error: incompatible types: int cannot be converted to Byte
//         return a; //error as we are returning non constant
//                ^
// Y.java:13: error: incompatible types: int cannot be converted to Short
//         return b; //error
//                ^
// Y.java:17: error: incompatible types: int cannot be converted to Character
//         return c; //error
//                ^
// 3 errors