//only objects of those classes can be thrown using throw keyword which are direct or indirect subclass of Throwable class

import java.io.IOError;

class I {
    public static void main(String[] args) {
        // throw new ArithmeticException();
        // throw new NullPointerException();
        // throw new Exception(); //Errror
        // throw new Error();
        // throw new IOError(new ArrayStoreException());

        throw new MyException();
    }
}
// I.java:13: error: incompatible types: MyException cannot be converted to Throwable
//         throw new MyException();
//         ^
// 1 error

class MyException /*extends RuntimeException */{

}