class G {
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println("Start-------------------");
        try {
            Cat cat = (Cat)animal; //-> problem generating code
        } catch(ClassCastException e) {
            System.out.println("Problem Solved");
        }
        System.out.println("End---------------------");
    }
}

// Start-------------------
// Problem Solved
// End---------------------


class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}