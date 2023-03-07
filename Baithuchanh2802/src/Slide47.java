// Viết chương trinh nhập vào các số nguyên và tính tổng các số đó, nếu tổng lớn hơn 100 thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập.

import java.util.Scanner;

public class Slide47 {

public static void main(String[] args) {
    int number, tong=0;
    try (Scanner sc = new  Scanner(System.in)) {
        do {
            System.out.println("Nhap vao so nguyen: ");
            number = sc.nextInt();
            tong += number ;
        } while (tong < 100);
    }
    int t = tong - number;
    System.out.println("Tong cac so nguyen la: " + t + " + " + number + " = " + tong);

}
}
