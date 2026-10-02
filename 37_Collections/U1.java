import java.util.ArrayList;

class U1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        //add(Object) - > appends
        list.add(67);
        list.add(12);
        list.add(34);
        list.add(65);
        list.add(87);
        System.out.println(list);

        //add(int, Object) - > inserts
        // list.add(5, 100); // OK
        list.add(6,100); //Not ok
        System.out.println(list);
    }
}
// [67, 12, 34, 65, 87]
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 6, Size: 5
//         at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
//         at java.base/java.util.ArrayList.add(ArrayList.java:481)
//         at U1.main(U1.java:17)