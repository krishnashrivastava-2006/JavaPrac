class N {
    public static void main(String[] args) {
        Float a = Float.valueOf(38.45); //here we are passing argument which is double type -> narrowing conversion

    }
}


// N.java:3: error: no suitable method found for valueOf(double)
//         Float a = Float.valueOf(38.45); //here we are passing argument which is double type -> narrowing conversion
//                        ^
//     method Float.valueOf(String) is not applicable
//       (argument mismatch; double cannot be converted to String)
//     method Float.valueOf(float) is not applicable
//       (argument mismatch; possible lossy conversion from double to float)
// 1 error