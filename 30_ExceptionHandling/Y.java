class Y {
    public static void main(String[] args) {

        //In try with resource declaration we can only use variable of type AutoCloseable
        //else error
        //AutoCloseable -> functional interface with exact one method i.e. close()

        try(String str = new String("om")) {

        }
    }
}

// Y.java:8: error: incompatible types: try-with-resources not applicable to variable type
//         try(String str = new String("om")) {
//                    ^
//     (String cannot be converted to AutoCloseable)
// 1 error
