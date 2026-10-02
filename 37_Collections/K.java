import java.util.Iterator;
import java.util.ArrayList;

class K {
    public static void main(String[] arsg) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Krishna");
        list.add("Ashi");
        list.add("Soumya");
        list.add("Chintu");
        list.add("Sona");

        System.out.println(list);
        System.out.println("---------------------");

        Iterator itr = list.iterator();

        while(itr.hasNext())
            System.out.println(itr.next() + " ###");


    }
}

// [Krishna, Ashi, Soumya, Chintu, Sona]
// ---------------------
// Krishna ###
// Ashi ###
// Soumya ###
// Chintu ###
// Sona ###