// Viết chương trình nhập vào các phần tử cho 1 ArrayList từ bàn phím.
// Sau đó tìm và hiển thị phần tử lớn nhất trong ArrayList đó

import java.util.Scanner;
import java.util.ArrayList;

public class Slide22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int number;
            System.out.print("Nhap so phan tu cua ArrayList: ");
            int n = sc.nextInt();
            for (int i=0; i<n; i++) {
                System.out.print("Nhap phan tu thu "+i+": ");
                number = sc.nextInt();
                arrlist.add(number);
            }
        }
        int max = arrlist.get(0);
        for (int i=1; i<arrlist.size(); i++) {
            if (arrlist.get(i).compareTo(max) > 0) {
                max = arrlist.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong ArrayList la: " +max);
    }
}