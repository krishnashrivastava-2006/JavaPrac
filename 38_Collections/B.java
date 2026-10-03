import java.util.ArrayList;

class B {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Omkar");
        list.add(3.5); 
        list.add(true);
        list.add(84);

        System.out.println(list);

        String str = list.get(0);
        System.out.println(str);
    }
}
// B.java:8: error: incompatible types: double cannot be converted to String
//         list.add(3.5);
//                  ^
// B.java:9: error: incompatible types: boolean cannot be converted to String
//         list.add(true);
//                  ^
// B.java:10: error: incompatible types: int cannot be converted to String
//         list.add(84);
//                  ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 3 errors