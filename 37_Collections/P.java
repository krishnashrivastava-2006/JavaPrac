import java.util.ArrayList;

class P {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(5);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(1);
        list.add(0);
        list.add(9);

        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(2))); 
        System.out.println(list);
    }
}

// [5, 3, 5, 6, 2, 1, 0, 9]
// true
// [5, 3, 5, 6, 1, 0, 9]
