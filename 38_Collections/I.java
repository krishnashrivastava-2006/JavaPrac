import java.util.ArrayList;

class I {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new Student1("Krishna", 20));
        list.add(new Student1("Ajay", 21));
        list.add(new Student1("Shubham", 19));
        list.add(new Student1("Anubhav", 20));
        list.add(new Student1("Kiran", 18));

        System.out.println(list); // [Krishna - 20, Ajay - 21, Shubham - 19, Anubhav - 20, Kiran - 18]
        // we overrided the toString() method meaningfully in Student1 class
    }
}