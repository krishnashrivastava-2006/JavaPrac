import java.util.ArrayList;

class X1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println(list.add(36));
        System.out.println(list.add(27));
        System.out.println(list.add(80));
        System.out.println(list.add(18));
        System.out.println(list.add(47));
        
        System.out.println(list);

        // System.out.println(list.add(3, 100));
        System.out.println(list.set(3, 200));

        System.out.println(list);

    }
}

// true
// true
// true
// true
// true
// [36, 27, 80, 18, 47]
// 18
// [36, 27, 80, 200, 47]

