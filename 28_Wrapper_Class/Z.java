class Z {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(78);

        System.out.println(a instanceof Number); //true

        Number b = Integer.valueOf(37);

        System.out.println(b); //<- Here Dynamic Method Diapatch happened
        // at compile time the compiler check if there is any toString() method in Number class
        //compilation pass
        //At run time 
        //The JVM checks the object assigned to variable b
        // It is of type Integer
        //Hence Integer toString() method version is executed rather than Number class


    }
}