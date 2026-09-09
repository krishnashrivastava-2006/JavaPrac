//Wrapper class method
// static -> toString(<primitive>)
// returns String object
// primitive to String conversion

class T {
    public static void main(String[] args) {
        int a = 358;

        // String str = a.toString(); //error: primitives cannot be dereferenced
        String str = Integer.toString(a);

        System.out.println(str);
    }
}