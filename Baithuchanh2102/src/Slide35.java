// Xây dựng chương trình cho phép nhập vào 2 số nguyên từ bàn phím, in ra màn hình số nhỏ nhất trong 2 số.

import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();

        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();

        int min = a;
        if (b < a) 
            min = b;
        
        System.out.println("So nho nhat trong hai so la: " + min);

        sc.close();
    }
}

