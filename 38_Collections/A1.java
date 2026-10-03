import java.util.ArrayList;

class A1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Omkar");
        list.add(4.5);
        list.add(false);
        list.add(93);

        System.out.println(list); // [Omkar, 4.5, false, 93]


        String str = (String)list.get(0);
        System.out.println(str); // Omkar

    }
}