import java.util.ArrayList;

class F {
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
            System.out.println(list[i]);
        }
    }
}

// F.java:19: error: array required, but ArrayList found
//             System.out.println(list[i]);
//                                    ^
// Note: F.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error