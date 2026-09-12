class C {
    public static void main(String[] args) {
        System.out.println("Start");

        Animal animal = new Dog();
        Cat cat = (Cat)animal; // ClassCastException -> program terminated

        System.out.println("End"); .//not executed
    }
}

// Start
// Exception in thread "main" java.lang.ClassCastException: class Dog cannot be cast to class Cat (Dog and Cat are in unnamed module of loader 'app')
//         at C.main(C.java:6)

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}