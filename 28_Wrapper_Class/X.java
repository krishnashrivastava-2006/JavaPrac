//The value we are returning is outside the range of respective data types

class X {
    public static void main(String[] args) {
        
    }

    static Byte aaa() {
        return 128; //error
    }

    static Short bbb() {
        return 32768; //error
    }

    static Character ccc() {
        return 65537; //error
    }
}

// X.java:7: error: incompatible types: int cannot be converted to Byte
//         return 128; //error
//                ^
// X.java:11: error: incompatible types: int cannot be converted to Short
//         return 32768; //error
//                ^
// X.java:15: error: incompatible types: int cannot be converted to Character
//         return 65537; //error
//                ^
// 3 errors
