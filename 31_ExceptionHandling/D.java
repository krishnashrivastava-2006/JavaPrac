//catch after finally -> error
class D {
    public static void main(String[] args) {
        try {

        } catch(ArithmeticException e) {

        } finally {

        } catch(ArrayIndexOutOfBoundsException e) {

        }
    }
}

// D.java:10: error: 'catch' without 'try'
//         } catch(ArrayIndexOutOfBoundsException e) {
//           ^
// 1 error