// Sử dụng Listlterator: phải import java.util.Listlterator

import java.util.ArrayList;
import java.util.ListIterator;

public class Slide19 {
    public static void main(String[] args) {
        // khai báo 1 ArrayList có tên là arrListChar
        // có kiểu là Character
        ArrayList<Character> arrListChar = new ArrayList<>();

        arrListChar.add('a');
        arrListChar.add('b');
        arrListChar.add('c');

        // khai báo một ListIterator có kiểu là Character
        ListIterator<Character> listIterator = arrListChar.listIterator();

        // hiển thị các pt có trong arrListChar
        // bằng cách sd ListIterator
        System.out.println("Cac phan tu co trong arrListChar la: ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + "\t");
        }
    }
}
