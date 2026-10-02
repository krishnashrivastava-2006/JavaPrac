import java.util.ArrayList;

class C {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println(list.size()); // 0
        System.out.println(list.isEmpty());// true

        //AutoBoxing as Collection framework does not support primitive data
        list.add(23);
        list.add(83);
        list.add(17);

        System.out.println(list.size()); // 3
        System.out.println(list.isEmpty());// false

    }
}