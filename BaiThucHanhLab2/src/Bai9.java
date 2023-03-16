// Viết chương trình nhập vào một chuỗi bất kỳ bao gồm cả số, ký tự thường và ký tự hoa từ bàn phím. Sau đó đếm và in ra số ký tự thường và ký tự hoa và số có trong chuỗi đó.

import java.util.Scanner;
public class Bai9 {
    public static void main(String[] argn) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap vao chuoi bat ky: ");
            String chuoi = sc.nextLine();
            int so = 0;
            int kytuthuong = 0;
            int kytuhoa = 0;
            for (int i = 0; i < chuoi.length(); i++) {
                char n = chuoi.charAt(i);
                if (Character.isDigit(n)) {
                    so++;
                }
                else if (Character.isLowerCase(n)) {
                    kytuthuong++;
                }
                else if (Character.isUpperCase(n)) { 
                    kytuhoa++;
                }
            }
            System.out.println("So ky tu so la: " +so);
            System.out.println("So ky tu thuong la: " +kytuthuong);
            System.out.println("So ky tu hoa la: " +kytuhoa);
        }

    }
}