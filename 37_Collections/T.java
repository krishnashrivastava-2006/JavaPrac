import java.util.ArrayList;

class T {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // boolean -> add(Object) -> appends 
        list.add(36);
        list.add(92);
        list.add(74);
        list.add(28);
        System.out.println(list);

        // void -> add(int, Object) -> insert
        list.add(3, 99);
        System.out.println(list);
    }
}

// [36, 92, 74, 28]
// [36, 92, 74, 99, 28]