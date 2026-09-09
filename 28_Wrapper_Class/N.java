class N {
    public static void main(String[]  a) {
        long x = 34; //widening conversion - > OK

        Long y = 34; //error -> as autoboxing only happens 
        //if the primitive type is assigned to its equivalent Wrapper class type variable

        System.out.println(y);
    }
}

// N.java:5: error: incompatible types: int cannot be converted to Long
//         Long y = 34; //error -> as autoboxing only happens
//                  ^
// 1 error