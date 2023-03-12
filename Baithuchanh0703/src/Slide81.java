// Viết chương trình nhập vào các phần tử cho một ma trận 2 chiều, sau đó tìm và hiển thị phần tử có giá trị lớn nhất trong ma trận đó.

import java.util.Scanner;

public class Slide81 {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int sodong, socot;
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
            int max = A[0][0];
            for (int i = 0; i < sodong; i++) {
                for (int j = 0; j < socot; j++) {
                    if (A[i][j] > max) max = A[i][j];
                }
            }
            System.out.println("Phan tu co gia tri lon nhat la: " + max);
        }

    }

}
