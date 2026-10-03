import java.util.LinkedList;

class S {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.offer(37);
        list.offer(92);
        list.offer(58);
        list.offer(28);
        list.offer(83);
        list.offer(17);

        System.out.println(list);


        System.out.println(list.peek()); // retrieves record at head
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peek());

        System.out.println(list);
    }
}

// [37, 92, 58, 28, 83, 17]
// 37
// 37
// 37
// 37
// 37
// 37
// [37, 92, 58, 28, 83, 17]