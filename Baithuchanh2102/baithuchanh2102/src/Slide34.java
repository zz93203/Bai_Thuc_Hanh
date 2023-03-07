// Xây dựng chương trình giải phương trình bậc 2, với các hệ số a,b,c nhập vào từ bàn phím.

import java.util.Scanner;

public class Slide34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap he so a la: ");
        float a = sc.nextFloat();

        System.out.print("Nhap he so b la: ");
        float b = sc.nextFloat();

        System.out.print("Nhap he so c la: ");
        float c = sc.nextFloat();

        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        }

        else if (delta == 0) {
            float x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x = " + x);
        }

        else {
            float X1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            float X2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 = " + X1);
            System.out.println("x2 = " + X2);
        }

        sc.close();
    }
}
