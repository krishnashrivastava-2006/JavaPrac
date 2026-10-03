import java.util.ArrayList;

class P {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");

        System.out.println(list);
        String str = new String("eee");
        System.out.println(list.contains(str)); // String class has meaningfully overided the equals(Object) method

        System.out.println(list);

    }
}

// [aaa, bbb, ccc, ddd, eee, fff]
// true
// [aaa, bbb, ccc, ddd, eee, fff]