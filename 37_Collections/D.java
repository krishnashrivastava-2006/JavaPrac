import java.util.ArrayList;
//ArrayList allows Heterogenuos records

class D {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Mohan");
        list.add(26);
        list.add(91.4);
        list.add(false);

        System.out.println(list); // [Mohan, 26, 91.4, false]
    }
}