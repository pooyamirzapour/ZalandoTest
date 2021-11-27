import java.util.*;

public class Test2 {

    public static void main(String[] args) {
        String str = "ccaaffddecee";
//        String str = "example";
//        String str = "eeeebbbbcccc";

        SortedMap<Character, Integer> map = new TreeMap();


        for (Character c : str.toCharArray()) {
            Integer count = map.get(c);
            if (count == null)
                map.put(c, 1);
            else
                map.put(c, count + 1);
        }

        SortedSet<Map.Entry<Character, Integer>> entrySortedSet = entriesSortedByValues(map);

        Integer count = 0;

        char key='A' ;
        boolean looped=false;
        for (Map.Entry<Character, Integer> entry : entrySortedSet) {

            for (Map.Entry<Character, Integer> entry2 : entrySortedSet) {

                if (entry.getKey() == entry2.getKey())
                    continue;
                if (entry.getValue() !=0) {
                    if (entry.getValue().equals(entry2.getValue())) {
                        entry2.setValue(entry2.getValue() - 1);
                        count++;
                        if (entry2.getValue()==1)
                        {
                            key=entry2.getKey();
                            looped=true;
                            break;
                        }

                    }
                }
            }
            System.out.println( String.valueOf( key));
            if (looped) {
                break;
            }
        }

        int index=0;
        int keyIndex=entrySortedSet.size();

        for (Map.Entry<Character, Integer> entry : entrySortedSet) {
            index++;
            if (entry.getKey().equals(key))
                keyIndex=index;
            if (index>keyIndex)
                count=count + entry.getValue();
        }

        System.out.println(count);
    }

    static <K, V extends Comparable<? super V>>
    SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
                    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                        int res = e1.getValue().compareTo(e2.getValue());
                        return res != 0 ? -res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
