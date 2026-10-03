import java.util.ArrayList;

class M {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();

        list.add(new Student1("Ramesh", 23));
        list.add(new Student1("Abhishek", 21));
        list.add(new Student1("Sooraj", 19));
        list.add(new Student1("Karishma", 20));
        list.add(new Student1("Ujjwal", 22));

        System.out.println(list); // [Ramesh - 23, Abhishek - 21, Sooraj - 19, Karishma - 20, Ujjwal - 22]

        Student1 stu = new Student1("Sooraj", 19);
        boolean flag = list.contains(stu);

        System.out.println(flag); //false
    }
}