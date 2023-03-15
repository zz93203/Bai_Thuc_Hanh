/* Viết chương trình nhập vào tên và một số tương ứng là năm. Sau đó xuất ra nhóm tuổi của người đó như sau:
   Nếu tuổi người đó < 16 thì hiện thông báo "Bạn [Tên] ở độ tuổi vị thành niên". 
   Nếu tuổi người đó >= 16 và nhỏ hơn 18 thì hiện thông báo "Bạn [Tên] ở độ tuổi trưởng thành". 
   Nếu tuổi người đó >= 18 thì hiện thông báo "Bạn [Tên] đã già".  */

import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ho va ten: ");
            String name = sc.nextLine();
            System.out.println("Nam sinh: ");
            int year = sc.nextInt();
            int tuoi = 2023 - year;
            if (tuoi < 16) {
                System.out.printf("ban %s o do tuoi vi thanh nien", name );
            } 
            else if (tuoi >= 16) {
                System.out.printf("Ban %s o do tuoi truong thanh", name);
            }
            else {
                System.out.printf("Ban %s da gia", name);
            }
            }

        }
    }
