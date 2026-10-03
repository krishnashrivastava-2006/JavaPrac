import java.util.ArrayList;
import java.util.Iterator;

class L {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();

        list.add(new Student1("Chetan", 20));
        list.add(new Student1("Aastha", 21));
        list.add(new Student1("Ananya", 19));
        list.add(new Student1("Ujjwal", 20));
        list.add(new Student1("Madhur", 22));
        list.add(new Student1("Krishna", 25));

        System.out.println(list);
        System.out.println("---------------------");

        Iterator<Student1> itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next() + " ^^^^");
        }
    }
}

// [Chetan - 20, Aastha - 21, Ananya - 19, Ujjwal - 20, Madhur - 22, Krishna - 25]
// ---------------------
// Chetan - 20 ^^^^
// Aastha - 21 ^^^^
// Ananya - 19 ^^^^
// Ujjwal - 20 ^^^^
// Madhur - 22 ^^^^
// Krishna - 25 ^^^^