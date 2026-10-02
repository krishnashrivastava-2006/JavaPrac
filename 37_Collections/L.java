import java.util.Iterator;
import java.util.ArrayList;

class L {
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

        while(itr.hasNext()) {
            String str = itr.next();
            
            System.out.println(str.toUpperCase() + " ###");
        }


    }
}
// L.java:20: error: incompatible types: Object cannot be converted to String
//             String str = itr.next();
//                                  ^
// 1 error