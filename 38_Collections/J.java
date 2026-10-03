import java.util.ArrayList;

class J {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(new Student1("Chetan", 20));
        list.add(new Student1("Aastha", 21));
        list.add(new Student1("Ananya", 19));
        list.add(new Student1("Ujjwal", 20));
        list.add(new Student1("Madhur", 22));
        list.add(new Student1("Krishna", 25));


        System.out.println("----------------------------------");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}

// []
// 0
// true
// ----------------------------------
// [Chetan - 20, Aastha - 21, Ananya - 19, Ujjwal - 20, Madhur - 22, Krishna - 25]
// 6
// false