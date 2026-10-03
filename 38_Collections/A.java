import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Omkar");
        list.add(4.5);
        list.add(false);
        list.add(74);

        System.out.println(list);

        String str = list.get(0); // Not ok as it will return Object not String we have to explicitly type cast
    }
}

// A.java:14: error: incompatible types: Object cannot be converted to String
//         String str = list.get(0); // Not ok as it will return Object not String we have to explicitly type cast
//                              ^
// Note: A.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error