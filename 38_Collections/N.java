import java.util.ArrayList;

class N {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();

        list.add(new Student1("Ramesh", 23));
        list.add(new Student1("Abhishek", 21));
        list.add(new Student1("Sooraj", 19));
        list.add(new Student1("Karishma", 20));
        list.add(new Student1("Ujjwal", 22));

        System.out.println(list); // [Ramesh - 23, Abhishek - 21, Sooraj - 19, Karishma - 20, Ujjwal - 22]


        Student1 s = new Student1("Ujjwal", 22);
        System.out.println(list.remove(s)); // false



        System.out.println(list); // [Ramesh - 23, Abhishek - 21, Sooraj - 19, Karishma - 20, Ujjwal - 22]
    }
}

// This is happening because we did not override the equals(Object) method in Student1 class
// So Object class method version is executed which compares the reference code of two object
// since here both object have different reference code even though its memeber variabkes vakue is same
// the equals(Object) method is comparing the reference code not memeber variables
// So we have to meaningfully implement equals(Object) method in Student2 class