class H {
    public static void main(String[] args) {
        System.out.println("Start");

        Animal animal = new Dog();

        try {
            Cat cat = (Cat)animal;  //program terminated
        } catch(ArithmeticException e) {  //-> catch block designed to handle other exception it will not be able to catch the exceptions other than arithmeticexception
            System.out.println("Problem Solved");
        }


        System.out.println("End");
    }
}

// Start
// Exception in thread "main" java.lang.ClassCastException: class Dog cannot be cast to class Cat (Dog and Cat are in unnamed module of loader 'app')
//         at H.main(H.java:8)
