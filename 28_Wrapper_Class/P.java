class P {
    public static void main(String[] args) {
        float x = 45; //OK -> widening conversion

        Float y = 45; //error:Incompatible types -> No autoBoxing
    }
}

// P.java:5: error: incompatible types: int cannot be converted to Float
//         Float y = 45; //error:Incompatible types -> No autoBoxing
//                   ^
// 1 error