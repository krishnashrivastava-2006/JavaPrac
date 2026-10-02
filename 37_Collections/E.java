import java.util.ArrayList;

class E {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Sumit");
        list.add("Mohan");
        list.add("Sudeep");
        list.add("Komal");
        list.add("Gian");
        list.add("Ramesh");

        String str = "Yamraj"; // false
        // String str = "Gian"; // true

        boolean flag = list.contains(str);

        System.out.println(flag);
    }
}