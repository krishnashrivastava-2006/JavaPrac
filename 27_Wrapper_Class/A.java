// Wrapper class constructors are deprecated
//you will get a warning, but you can still run the program

class A {
    public static void main(String[] args) {
        Boolean flag = new Boolean(true);

        System.out.println(flag);
    }
}

// A.java:6: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
//         Boolean flag = new Boolean(true);
//                        ^
// 1 warning