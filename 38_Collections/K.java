import java.util.ArrayList;

class K {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();

        list.add(new Student1("Chetan", 20));
        list.add(new Student1("Aastha", 21));
        list.add(new Student1("Ananya", 19));
        list.add(new Student1("Ujjwal", 20));
        list.add(new Student1("Madhur", 22));
        list.add(new Student1("Krishna", 25));

        System.out.println(list);
        System.out.println("-----------------------------");

        for(Student1 next : list) {
            System.out.println(next + " ~~~~");
        }
    }
}

// [Chetan - 20, Aastha - 21, Ananya - 19, Ujjwal - 20, Madhur - 22, Krishna - 25]
// -----------------------------
// Chetan - 20 ~~~~
// Aastha - 21 ~~~~
// Ananya - 19 ~~~~
// Ujjwal - 20 ~~~~
// Madhur - 22 ~~~~
// Krishna - 25 ~~~~