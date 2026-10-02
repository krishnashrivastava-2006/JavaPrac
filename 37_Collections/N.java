//ArrayList can grow or shrink
import java.util.ArrayList;

class N {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println(list); //[]

        list.add("Kartik");
        list.add("Vikram");
        list.add("Abhishek");
        list.add("Omkar");
        list.add("Rameshwar");
        list.add("Karan");

        System.out.println(list); //[Kartik, Vikram, Abhishek, Omkar, Rameshwar, Karan]

        // String str = "Yamraj";
        String str = "Omkar";

        boolean flag = list.remove(str);

        System.out.println(flag);
        System.out.println(list);
    }
}