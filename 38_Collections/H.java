import java.util.ArrayList;

class H {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("Jayesh", 20);
        Student s2 = new Student("Karan", 19);
        Student s3 = new Student("Ramesh", 21);
        Student s4 = new Student("Abhishek", 25);
        Student s5 = new Student("Rishab", 18);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println(list); // [Student@36baf30c, Student@7a81197d, Student@5ca881b5, Student@24d46ca6, Student@4517d9a3]
        
        // This is because we didnot override the toString() method in Student class so Object class toString() version is executed
        // which prints the ref code in hexadecimal fomr of the object
    }
}