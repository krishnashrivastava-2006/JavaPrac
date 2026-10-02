import java.util.ArrayList;

class X {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println(list.add(36));
        System.out.println(list.add(27));
        System.out.println(list.add(80));
        System.out.println(list.add(18));
        System.out.println(list.add(47));
        
        System.out.println(list);

        System.out.println(list.add(3, 100));
        System.out.println(list.set(3, 200));

        System.out.println(list);

    }
}

// X.java:15: error: 'void' type not allowed here
//         System.out.println(list.add(3, 100));
//                                    ^
// Note: X.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error