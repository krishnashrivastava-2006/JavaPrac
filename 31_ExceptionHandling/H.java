//Nested Try-catch block -> legal

class H {
    public static void main(String[] args) {
        try {
            try {

            } catch(ArithmeticException e) {

            } finally {

            }
        } catch(ArithmeticException e) {
            try {

            } catch(ArithmeticException e1) {

            } finally {

            }
        } finally {
            try {

            } catch(ArithmeticException e) {

            } finally {

            }
        }
    }
}