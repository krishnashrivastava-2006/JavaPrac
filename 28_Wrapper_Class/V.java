// this will give error as we are initializing ref variable of wrapper classes
// by argument passing and not through assignent operator
// we have to explicitly type cast or error

class V {
    public static void main(String[] args) {
        aaa(12);
        bbb(35);
        ccc(74);
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

// V.java:7: error: incompatible types: int cannot be converted to Byte
//         aaa(12);
//             ^
// V.java:8: error: incompatible types: int cannot be converted to Short
//         bbb(35);
//             ^
// V.java:9: error: incompatible types: int cannot be converted to Character
//         ccc(74);
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 3 errors