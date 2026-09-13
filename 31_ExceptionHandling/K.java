//Error-> if there are multiple catch block and if the paramter variable of catch block pass Is-A
// relation then child class type variable catch should come before the catch block
//haviing parent class tye Exception variable, else error.

class K {
    public static void main(String[] args) {
        try {
            //<= StringIndexOutOfBoundsException
            //<= ArrayIndexOutOfBoundsException
        } catch(IndexOutOfBoundsException e) {

        } catch(ArrayIndexOutOfBoundsException e) {

        }
    }
}
// K.java:11: error: exception ArrayIndexOutOfBoundsException has already been caught
//         } catch(ArrayIndexOutOfBoundsException e) {
//           ^
// 1 error