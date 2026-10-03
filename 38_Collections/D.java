import java.util.ArrayList;

class D {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(37);
        list.add(13);
        list.add(53);
        list.add(24);
        list.add(63);
        list.add(52);
        list.add(76);

        System.out.println(list); // [37, 13, 53, 24, 63, 52, 76]

        int size = list.size(); // 7
        for(int i = 0; i < size; i++) {
            System.out.println(list.remove(i) + " +++");
        }
        // 37 +++
        // 53 +++
        // 63 +++
        // 76 +++
        // Exception in thread "main" java.lang.IndexOutOfBoundsException
        
        
        System.out.println(list); 
    }
}

// [37, 13, 53, 24, 63, 52, 76]
// 37 +++
// 53 +++
// 63 +++
// 76 +++
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 3
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.remove(ArrayList.java:504)
//         at D.main(D.java:19)