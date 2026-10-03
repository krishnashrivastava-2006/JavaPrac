import java.util.ArrayList;

class B1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // ArrayList list = new ArrayList<>();

        list.add("Ghanshyam");
        list.add("Ramesh");
        list.add("Abhishek");
        list.add("Krishna");
        list.add("Sooraj");

        System.out.println(list); //[Ghanshyam, Ramesh, Abhishek, Krishna, Sooraj]

        String str = list.get(0);
    }
}