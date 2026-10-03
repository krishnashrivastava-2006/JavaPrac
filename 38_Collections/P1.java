import java.util.ArrayList;

class P1 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();

        marks.add(78);
        marks.add(89);
        marks.add(45);
        marks.add(67);
        marks.add(32);
        marks.add(71);

        System.out.println(marks);

        Integer y = 67;
        System.out.println(marks.contains(y));
    }    
}
// [78, 89, 45, 67, 32, 71]
// true