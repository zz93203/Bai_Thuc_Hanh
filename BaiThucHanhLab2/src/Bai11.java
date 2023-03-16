/* Viết chương trình thực hiện các công việc sau:
Nhập liệu cho mảng A có n phần tử nguyên từ bàn phím. Sắp xếp mảng số đã nhập tăng dần theo giá trị của các phần tử có trong mảng. In ra màn hình mảng số ban đầu và mảng đã sắp xếp theo thứ tự tăng dần.
*/

import java.util.Arrays;
import java.util.Scanner;
public class Bai11 {
    public static void main(String[] argn) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            do {
                System.out.println("Nhap so phan tu cua mang: ");
                n = sc.nextInt();
            } while (n <= 0);
            int A[] = new int[n];
            for(int i = 0; i < A.length; i++)
            {
                System.out.println("Nhap vao cac gia tri cua mang: ");
                A[i] = sc.nextInt();
            }
            System.out.println("Mang A ban dau la: " + Arrays.toString(A));
            Arrays.sort(A); // sắp xếp mảng A theo thư tự tăng dần
            System.out.println("Mang A da sap xep theo thu tu tang dan la: " + Arrays.toString(A));
        }
    }
}