//Character wrapper class only has one methid version
// of valueOf(char)

class Y {
    public static void main(String[] args) {
        Character c = Character.valueOf(737); //error 
    }
}

// Y.java:6: error: incompatible types: possible lossy conversion from int to char
//         Character c = Character.valueOf(737); //error method not found - >valueOf(int)
//                                         ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 err