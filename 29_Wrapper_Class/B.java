class B {
    public static void main(String[] args) {
        //Boxing , then conversion

        Number a = 27; // autoboxing -> Integer object
        Number b = 3.4; //autoboxing -> Double object
        Number c = 74L; //autoboxing -> Long object

        // Number d = 'A'l //Not Ok error
        //Number is not parent of Character
    }
}