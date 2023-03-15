// Viết chương trình nhập vào một dãy số gồm n số nguyên từ bàn phím. Tính và in ra màn hình trung bình cộng của n số nguyên đã nhập

import java.util.Scanner;
public class Bai8 {
    public static void main(String[] argn) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap so luong so nguyen duong can tinh: ");
            int n = sc.nextInt();
            int tong = 0;
            for (int i = 1; i <= n; i++) {
                System.out.println("Nhap so nguyen thu "+ i +": ");
                int a = sc.nextInt();
                tong += a;
            }
            double tbc = (double) tong / n;
            System.out.println("Trung binh cong cua " + n + " so nguyen da nhap la: " + tbc);
        }

    }
}