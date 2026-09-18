// Throwable class is checked exception but still we can create catch block
// though Throwable was never thrown from the body of corresponding try block

class H2 {
    public static void main(String[] args) {
        try {

        } catch(Throwable e) {

        }
    }
}