// Viết chương trình nhập từ bàn phím một chuỗi không quá 80 ký tự và một ký tự bất kỳ. Đếm và in ra màn hình số lần xuất hiện của ký tự đó trong chuỗi vừa nhập.

import java.util.Scanner;
public class Bai10 {
    public static void main(String[] argn) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap vao chuoi ky tu: ");
            String chuoi = sc.nextLine();
            System.out.println("Nhap ky can dem: ");
            char n = sc.nextLine().charAt(0);
            int dem = 0;
            for (int i = 0; i < chuoi.length(); i++) {
                if (chuoi.charAt(i) == n); {
                    dem++;
                }
            }
            System.out.printf("So lan xuat hien ky tu %c trong chuoi la: %d",n,dem);
        }
    }
}