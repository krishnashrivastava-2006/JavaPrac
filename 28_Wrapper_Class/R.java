//outside range -> error

class R {
    public static void main(String[] args) {
        Byte a = 128; //error
        Short b = 65538; //error
        Character c = -23; //error
    }
}

// R.java:3: error: incompatible types: int cannot be converted to Byte
//         Byte a = 128; //error
//                  ^
// R.java:4: error: incompatible types: int cannot be converted to Short
//         Short b = 65538; //error
//                   ^
// R.java:5: error: incompatible types: int cannot be converted to Character
//         Character c = -23; //error
//                       ^
// 3 errors