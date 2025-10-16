package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1=new File("src\\main\\resources\\dushi.txt");
        Scanner sc=new Scanner(file1);
        sc.useDelimiter("[.,:;()?!\"\\s–]+");
        Map<String,Integer> map1=new HashMap<>();
        int count=0;
        while (sc.hasNext()){
            String slovo=sc.next();
            if (map1.containsKey(slovo)){
//                map1.get(sc.next());
                Integer i = map1.get(slovo);
                map1.put(slovo,++i);}
            else map1.put(slovo,1);
        }
        sc.close();
//        System.out.println(map1);

//        for (Map.Entry<String, Integer> entry:map1.entrySet()){
//            if (entry.getValue()>1000)
//                System.out.println(entry.getKey()+entry.getValue());
//        }
        System.out.println("Слово Чичиков было использовано в произведении раз: " + map1.get("Чичиков") ); // Чичиков - 601

//        Map<> map2=new LinkedHashMap<>();




        for (int i = 1; i < 101; i++) {
            int max=Integer.MIN_VALUE;
            String key1="";
            for (Map.Entry<String, Integer> entry:map1.entrySet()){
                if (entry.getValue()>max){
                    max=entry.getValue();
                    key1=entry.getKey();
                }
//            System.out.println(entry.getKey()+entry.getValue());
            }
            System.out.println(i+" "+ key1+" "+map1.get(key1));
            map1.remove(key1);
        }






    }
}
