import java.util.LinkedList;
// Queue specific behaviour
// boolean -> offer(E)
// E -> peek()
// E -> poll()
class T {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.offer(28);
        list.offer(98);
        list.offer(37);
        list.offer(16);
        list.offer(49);

        System.out.println(list);

        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());


        System.out.println(list);
    }
}

// [28, 98, 37, 16, 49]
// 28
// 98
// 37
// 16
// 49
// []