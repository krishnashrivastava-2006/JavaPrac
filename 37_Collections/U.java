import java.util.ArrayList;

class U {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        //add(Object) -> appends
        list.add(73);
        list.add(93);
        list.add(26);
        list.add(82);
        System.out.println(list);

        //append(int, Object) - > inserts
        list.add(4, 76);
        System.out.println(list);
    }
}
// [73, 93, 26, 82]
// [73, 93, 26, 82, 76]