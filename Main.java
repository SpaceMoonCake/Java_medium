package HomeWork03;

import java.util.*;

public class Main {
    public static void main (String[] arg){
        //Создать массив с набором слов(могут быть првторяющиеся)
        String[] arrayWords = {
                "Крот", "Крот", "Заяц",
                "Воин", "Пингвин", "Пингвин",
                "Пингвин", "Тюлень"
        };
        //Выводим уникальные значения массива
        Set<String> hashSetWords = new HashSet<>(Arrays.asList(arrayWords));
        System.out.println(hashSetWords);
        System.out.println(numberIdenticalWords(arrayWords));
        //
    }

    public static Map<String, Integer> numberIdenticalWords(String[] arrayWords) {
        HashMap<String, Integer> hashMapNumberIdenticalWords = new HashMap<>();
        for(String word : arrayWords){
            if (!hashMapNumberIdenticalWords.containsKey(word)){
                hashMapNumberIdenticalWords.put(word, 1);
            } else {
                hashMapNumberIdenticalWords.put(word, hashMapNumberIdenticalWords.get(word)+1);
            }
        }
        return hashMapNumberIdenticalWords;
    }

}
