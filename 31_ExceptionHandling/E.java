//try with multiple finally -> error
class E {
    public static void main(String[] args) {
        try {
            
        } catch(ArithmeticException e) {

        } finally {

        } finally {

        }
    }
}
// E.java:10: error: 'finally' without 'try'
//         } finally {
//           ^
// 1 error