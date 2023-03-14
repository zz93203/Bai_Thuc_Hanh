// Viết chương trình kiểm tra số vừa nhập vào là số chẵn hay lẻ. 

import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap vao mot so: ");
            float n = sc.nextFloat();
            if (n % 2 == 0) {
                System.out.println("So nhap vao la so chan");
            }
            else {
                System.out.println("So nhap vao la so le");
            }
        }
        

    }

}

