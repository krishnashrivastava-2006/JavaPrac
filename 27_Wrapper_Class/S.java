class S {
    public static void main(String[] args) {
        byte x = 83; //No error even though narrowing conversion

        Byte y = Byte.valueOf(83); //Error -> as we are initialising it by argument passing and not through assignment operator

    }
}

// S.java:5: error: no suitable method found for valueOf(int)
//         Byte y = Byte.valueOf(83); //Error -> as we are initialising it by argument passing and not through assignment operator
//                      ^
//     method Byte.valueOf(byte) is not applicable
//       (argument mismatch; possible lossy conversion from int to byte)
//     method Byte.valueOf(String) is not applicable
//       (argument mismatch; int cannot be converted to String)
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error