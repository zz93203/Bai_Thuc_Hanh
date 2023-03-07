// Xây dựng chương trình cho phép nhập vào một số n từ bàn phím, tính tổng các chữ số của số n vừa nhập vào.

import java.util.Scanner;

public class Slide30 {

    public static void main(String[] args)  {
        int n, sd, tong=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen duong: ");
        n = sc.nextInt();
        while (n>0){
            sd = n % 10;
            n = n / 10;
            tong += sd;
        }
        System.out.println("tong cac chu so =" + tong);

        sc.close();
    }
}
