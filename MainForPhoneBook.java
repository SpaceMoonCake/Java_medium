package HomeWork03;

import java.sql.SQLOutput;

public class MainForPhoneBook {
    public static void main(String[] arg){
        PhoneBook book = new PhoneBook();
        book.add("Mary", "+33611122333");
        book.add("Mary", "+33611122333");
        book.add("Mary", "+33522211333");
        book.add("John", "+79061112211");
        System.out.println(book.getNumber("Mary"));
        System.out.println(book.getNumber("John"));
        System.out.println(book.getNumber("Peter"));

        System.out.println(book.getPhoneBook());
    }
}
