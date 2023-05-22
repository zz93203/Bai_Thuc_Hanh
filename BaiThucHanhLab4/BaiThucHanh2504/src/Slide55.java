// Viết chương trình sử dụng phương thức xóa 1 phần tử bất kỳ khỏi HashSet

import java.util.HashSet;
import java.util.Scanner;

public class Slide55 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // them cac phan tu vao hashSetString
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");

        // hien thi cac phan tu trong hashSetString
        System.out.println("Cac phan tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = sc.nextLine();
        // neu pt can xoa co ton tai hashSetString thi thong bao xoa thanh cong
        // va hien thi cac pt con lai, nguoc lai thong bao xoa khong thanh cong
        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong hashSetString: ");
            System.out.println(hashSetString);
        }
        else {
            System.out.println("Xoa khong thanh cong!");
        }
    }
}