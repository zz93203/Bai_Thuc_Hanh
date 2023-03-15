// Viết chương trình nhập vào 1 số nguyên dương bất kỳ từ bàn phím. Sau đó tính và in ra giai thừa của số đó.

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] argn) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            do {
                System.out.println("Nhap vao 1 so nguyen duong: ");
                n = sc.nextInt();
            } while(n <= 0);
            int giaithua = 1;
            for (int i = 1; i <= n; i++) {
                giaithua *= i;
            }
            System.out.printf("Giai thua cua %d la: %d " ,n ,giaithua);
        }
    }
}
