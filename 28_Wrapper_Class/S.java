//should be initialsed with constant value and with assignment operator only

class S {
    public static void main(String[] args) {
        int n = 12;

        Byte x = n; //error - > not constant
        Short y = n; //error
        Character z = n;  //error
    }
}

// S.java:7: error: incompatible types: int cannot be converted to Byte
//         Byte x = n; //error - > not constant
//                  ^
// S.java:8: error: incompatible types: int cannot be converted to Short
//         Short y = n; //error
//                   ^
// S.java:9: error: incompatible types: int cannot be converted to Character
//         Character z = n;  //error
//                       ^
// 3 errors