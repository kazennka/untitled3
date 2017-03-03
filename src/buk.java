import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class buk {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        try (Scanner s = new Scanner(new File("C:\\Users\\admin\\Desktop\\Толстой Лев. Война и мир. Том 1 - royallib.ru.txt"),"Cp1251")) {
            while (s.hasNext()) {

                String word = s.next();
                if (hashMap.containsKey(word)) {
                    int q = hashMap.get(word);
                    hashMap.put(word, q + 1);
                } else
                    hashMap.put(word, 1);

            }

        }
        Set<HashMap.Entry<String, Integer>> set = hashMap.entrySet();
        ArrayList<HashMap.Entry<String, Integer>> list = new ArrayList<>(set);
        list.sort((e1,e2)->-e1.getValue().compareTo(e2.getValue()));
        for (HashMap.Entry<String, Integer> me : list) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());

        }
    }
}
