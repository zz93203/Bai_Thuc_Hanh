import java.util.LinkedList;

public class Slide38 {
    public static void main(String[] args) {
        // khai báo 1 LinkedList có tên là list
        // có kiểu là String
        LinkedList<String> list = new LinkedList<String>();
        // Add objects to list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("Vi du su dung phuong thuc addAll()");
        System.out.println("----------------------------------");
        // thêm các phần tử của list và listA
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA: ");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc retainAll()");
        System.out.println("-----------------------------------");
        // khoi tao listB
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        // xoa cac phan tu khong thuoc listB khoi listA
        listA.retainAll(listB);
        showList(listB);

        System.out.println("\nvi du su dung phuong thuc removeAll()");
        System.out.println("-----------------------------------");
        // xoa cac phan tu thuoc listB khoi list
        list.removeAll(listB);
        System.out.println("list: ");
        showList(list);
    }
    public static void showList(LinkedList<String> list) {
        // show list through for-each
        for (String: obj : list) {
            System.out.print("\t "+obj+", ");
        }
        System.out.print("");
    }
}