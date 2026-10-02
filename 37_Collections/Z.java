import java.util.ArrayList;

class Z {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(2);
        list.add(36);
        list.add(4);
        list.add(27);

        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list);



    }
}

// [2, 36, 4, 27]
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.get(ArrayList.java:427)
//         at Z.main(Z.java:13)

