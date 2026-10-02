import java.util.ArrayList;

class H {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Mohan");
        list.add("Sohan");
        list.add("Ramesh");
        list.add("Krishna");
        list.add("Samee");

        System.out.println(list);
        System.out.println("---------------------");

        for(String next : list)
            System.out.println(next);

    }
}

// H.java:16: error: incompatible types: Object cannot be converted to String
//         for(String next : list)
//                           ^
// Note: H.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error