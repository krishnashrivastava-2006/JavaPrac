import java.util.ArrayList;

class Y {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(2);
        list.add(36);
        list.add(4);
        list.add(27);
        list.add(78);
        System.out.println(list);

        //Object -> remove(int) , not boolean -> remove(Object)
        list.remove(4);
        System.out.println(list);
    }
}

// [2, 36, 4, 27, 78]
// [2, 36, 4, 27]