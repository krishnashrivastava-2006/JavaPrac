import java.util.LinkedList;
// Stack specific behaviour
class U {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.push(37);
        list.push(94);
        list.push(26);
        list.push(15);
        list.push(65);

        System.out.println(list); // [65, 15, 26, 94, 37]

        System.out.println(list.pop()); // 65
        System.out.println(list.pop()); // 15
        System.out.println(list.pop()); // 26
        System.out.println(list.pop()); // 94
        System.out.println(list.pop()); // 37


        System.out.println(list); // []
    }
}