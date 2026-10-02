import java.util.ArrayList;
import java.util.Iterator;

class M {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Krishna");
        list.add("Ashi");
        list.add("Soumya");
        list.add("Chintu");
        list.add("Sona");

        System.out.println(list);
        System.out.println("--------------------");

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str.toUpperCase() + " ++++");
        }
    }
}

// [Krishna, Ashi, Soumya, Chintu, Sona]
// --------------------
// KRISHNA ++++
// ASHI ++++
// SOUMYA ++++
// CHINTU ++++
// SONA ++++