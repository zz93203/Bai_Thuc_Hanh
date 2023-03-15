// Viết chương trình nhập vào các số nguyên và tính tổng các số đó, nếu tổng lớn hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập.

import java.util.Scanner;
public class Bai5 {
    public static void main(String[] argn) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int n, tong = 0;
            do {
                System.out.println("Nhap vao 1 so nguyen: ");
                n = sc.nextInt();
                tong += n;
            } while (tong <= 100);
            System.out.println("Tong cua cac so da nhap la: " +tong);
        }
    }
}