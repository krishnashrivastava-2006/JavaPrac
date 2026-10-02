import java.util.ArrayList;

class G {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Ajay");
        list.add("Kiran");
        list.add("Shubham");
        list.add("Anubhav");
        list.add("Tanu");
        list.add("Raj");

        System.out.println(list);

        System.out.println("-----------------------------------------");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "~~~~");
        }
    }
}

// [Ajay, Kiran, Shubham, Anubhav, Tanu, Raj]
// -----------------------------------------
// Ajay~~~~
// Kiran~~~~
// Shubham~~~~
// Anubhav~~~~
// Tanu~~~~
// Raj~~~~

