class O {
    public static void main(String[] args) {
        double x = 3.4f; //widening conversion: float -> double

        Double y = 3.4f; //error
        //For autoboxing the primitive value and wRapper class must be of equivalent types
    }
}

// O.java:5: error: incompatible types: float cannot be converted to Double
//         Double y = 3.4f; //error
//                    ^
// 1 error