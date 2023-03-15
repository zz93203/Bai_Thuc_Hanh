/* Nhập vào 2 số bất kỳ từ bàn phím và thực hiện các yêu cầu sau:
   1. Tính tổng, hiệu, tích, thương, chia lấy dư của 2 số đó.
   2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó. */

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap va so thu nhat: ");
            double a = sc.nextFloat();
            System.out.println("Nhap vao so thu hai: ");
            double b = sc.nextFloat();
            double tong = a + b;
            double hieu = a - b;
            double tich = a * b;
            double thuong = a / b;
            double chialaydu = a % b;
            System.out.println("Tong: " + tong);
            System.out.println("Hieu: " + hieu);
            System.out.println("Tich: " + tich);
            System.out.println("Thuong: " + thuong);
            System.out.println("Chialaydu: " + chialaydu);
            if (a > b) {
                System.out.println("So thu nhat lon hon");
            }
            else if(a < b) {
                System.out.println("So thu hai lon hon");
            }
            else {
                System.out.println("hai so bang mhau");
            }
        }
    }
}
