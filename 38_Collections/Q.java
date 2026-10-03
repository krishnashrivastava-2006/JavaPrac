import java.util.ArrayList;

class Q {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();

        list.add(new Student2("Krishna", 20));
        list.add(new Student2("Chetan", 21));
        list.add(new Student2("Aastha", 21));
        list.add(new Student2("Ananaya", 19));
        list.add(new Student2("Madhur", 22));

        System.out.println(list);

        // Student2 stu = new Student2("Ujjwal", 21);
        Student2 stu = new Student2("Madhur", 22);
        boolean flag = list.remove(stu);


        System.out.println(list);
        System.out.println(flag);
    }
}

// [Krishna - 20, Chetan - 21, Aastha - 21, Ananaya - 19, Madhur - 22]
// [Krishna - 20, Chetan - 21, Aastha - 21, Ananaya - 19]
// true