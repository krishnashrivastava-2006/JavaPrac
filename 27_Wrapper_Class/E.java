//If we didnt initialize a class type variable
//then by default null is assigned to it

class E {
    static Boolean x;

    public static void main(String[] args) {
        System.out.println(x); //null
    }
}