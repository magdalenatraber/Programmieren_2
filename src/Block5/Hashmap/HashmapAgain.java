package Block5.Hashmap;

import java.util.HashMap;

public class HashmapAgain {
    public static void main(String[] args) {
        HashMap<String,Integer> hashi = new HashMap<>();
        hashi.put("Kleinsasser",5);
        hashi.put("Summer",0);
        hashi.put("Kofler",3);
        hashi.put("Kofler",4);

        System.out.println(hashi.get("Summer"));
        System.out.println(hashi.get(""));
        hashi.getOrDefault("Sumer",0);

        System.out.println(hashi.containsKey("Kleinsasser"));

        for (String key: hashi.keySet()) {
            System.out.println(key+ " " + hashi.get(key));
        }
        String[] people ={"Weirer","Summer", "Wild", "Weirer","Safar"};
        System.out.println(countLaughs(people));
    }

    public static HashMap<String,Integer> countLaughs(String[]laughter){
        HashMap<String,Integer> funny = new HashMap<>();
        for (String key: laughter) {

            funny.put(key, funny.getOrDefault(key,0) +1);
        }
        return funny;
    }


}
