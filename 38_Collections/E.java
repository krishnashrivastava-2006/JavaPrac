import java.util.ArrayList;

class E {
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

        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.remove(i) + " ???");
        }

        System.out.println(list); // []
    }
}

// [37, 13, 53, 24, 63, 52, 76]
// 76 ???
// 52 ???
// 63 ???
// 24 ???
// 53 ???
// 13 ???
// 37 ???
// []