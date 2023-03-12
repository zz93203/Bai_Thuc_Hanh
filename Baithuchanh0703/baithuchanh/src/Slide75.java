// Viết chương trình tính tổng các số chẵn của mảng 2 chiều

import java.util.Scanner;

public class Slide75 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int sodong, socot, tong = 0;
            do {
                System.out.println("Nhap vao kich thuoc cua so dong: ");
                sodong = sc.nextInt();
            } while (sodong <= 0);
            do {
                System.out.println("Nhap vao kich thuoc cua so cot: ");
                socot = sc.nextInt();
            } while (socot <= 0);
            int A[][] = new int[sodong][socot];
            for (int i = 0; i < sodong; i++) {
                for (int j = 0; j < socot; j++) {
                    System.out.print("Nhap vao phan tu A[" + i + "][" + j + "]: ");
                    A[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < sodong; i++) {
                for (int j = 0; j < socot; j++) {
                    if (A[i][j] % 2 == 0) tong += A[i][j];
                }
            }
            System.out.println("Tong cac so chan la: " + tong);
            sc.close();
        }
    }
}
