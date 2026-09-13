//No Error

class K1 {
    public static void main(String[] args) {
        try {
            // =>StringIndexOutOfBoundsException
            // =>ArrayIndexOutOfBoundsException
        } catch(ArrayIndexOutOfBoundsException e) { //child

        } catch(IndexOutOfBoundsException e) { //parent

        }
    }
}