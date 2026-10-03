import java.util.ArrayList;

class G {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(37);
        list.add(13);
        list.add(53);
        list.add(24);
        list.add(63);
        list.add(52);
        list.add(76);

        System.out.println(list);

        while(list.size() != 0) {
            System.out.println(list.remove(0) + " ###");
        }

        System.out.println(list);
    }
}

// [37, 13, 53, 24, 63, 52, 76]
// 37 ###
// 13 ###
// 53 ###
// 24 ###
// 63 ###
// 52 ###
// 76 ###
// []