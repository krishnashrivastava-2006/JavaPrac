import java.util.ArrayList;

class W {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(37);
        list.add(20);
        list.add(18);
        list.add(35);

        System.out.println(list);
        // list.add(4, 100); //OK -> inserts at index 4
        list.set(4, 100); //Not OK -> no record to replace at index 4 -> exception
        System.out.println(list);


    }
}

// [37, 20, 18, 35]
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.set(ArrayList.java:441)
//         at W.main(W.java:14)