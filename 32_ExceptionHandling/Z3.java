class Z3 {
    public static void main(String[] args) {
        aaa();
    }

    static void aaa() {
        bbb();
    }

    // static void bbb() throws ClassNotFoundException { // -> Error as it is checked exception the method which called it should handle it using try catch or simply declare in its method signature body
    static void bbb() throws ArithmeticException { // -> No Error(unchecked Exception)

    }
}