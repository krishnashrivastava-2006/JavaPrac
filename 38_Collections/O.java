import java.util.ArrayList;

class O {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new Student2("Ramesh", 22));
        list.add(new Student2("Sameer", 21));
        list.add(new Student2("Ritika", 25));
        list.add(new Student2("Karan", 20));
        list.add(new Student2("Abhishek", 19));
        list.add(new Student2("Yamraj", 100));

        System.out.println(list);

        Student2 stu = new Student2("Abhishek", 19);
        boolean flag = list.contains(stu);

        System.out.println(flag);
    }
}
// [Ramesh - 22, Sameer - 21, Ritika - 25, Karan - 20, Abhishek - 19, Yamraj - 100]
// true