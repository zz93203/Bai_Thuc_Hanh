// Viết chương trình tính tổng các số chẵn của mảng 1 chiều

import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) throws Exception 
    {
        int n, tong = 0;
        try (Scanner sc = new Scanner(System.in)) {
            do{
                System.out.println("Nhap vao kich thuoc cua mang:");
                n = sc.nextInt();     
            }while(n<=0);
            int arrA[] = new int[n];
            for(int i = 0; i < arrA.length; i++)
            {
                System.out.println("Nhap vao cac gia tri cua mang: ");
                arrA[i] = sc.nextInt();
            }
            for(int i = 0; i < arrA.length; i++)
            {
                if(arrA[i] %2 == 0) tong = tong + arrA[i];
            }
        }
        System.out.printf("tong cac so chan la: " + tong);

    }
}