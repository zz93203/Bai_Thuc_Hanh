// Viết chương trình sd pt xóa 1 pt bất kỳ khỏi LinkedHashSet

import java.util.LinkedHashSet;
import java.util.Set;

public class Slide59 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");
        // show set
        for (String str : linkedHashSet) {
            System.out.println(str);
        }
    }
}