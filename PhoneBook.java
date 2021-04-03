package HomeWork03;

import java.util.*;

public class PhoneBook  {
    private Map<String, HashSet<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new TreeMap<>();
    }

    public void add(String name, String number) {
        if(phoneBook.containsKey(name)) {
            phoneBook.get(name).add(number);
        }
        else {
            HashSet <String> numbers = new HashSet<>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }

    public HashSet<String> getNumber(String name){
        return phoneBook.get(name);
    }

    public Map<String, HashSet<String>> getPhoneBook(){
        return phoneBook;
    }


}
