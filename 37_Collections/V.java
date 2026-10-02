import java.util.ArrayList;

class V {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        //boolean  -  add(Object) -> Appends
        list.add(23);
        list.add(45);
        list.add(30);
        list.add(37);
        System.out.println(list);

        //void  -  add(int, Object) -> inserts
        list.add(2, 56);
        System.out.println(list);

        //Object  -  set(int, Object) -> replace and retrieve the replaced record
        list.set(2, 100);
        System.out.println(list);

    }
}

// [23, 45, 30, 37]
// [23, 45, 56, 30, 37]
// [23, 45, 100, 30, 37]