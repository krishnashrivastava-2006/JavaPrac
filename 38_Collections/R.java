import java.util.LinkedList;

class R {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.offer(46);
        list.offer(37);
        list.offer(27);
        list.offer(84);
        list.offer(29);

        System.out.println(list); // [46, 37, 27, 84, 29]
    }
}