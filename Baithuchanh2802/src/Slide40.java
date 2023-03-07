// Viết chương trình nhập vào 1 số (1 đến 7 tương ứng với chủ nhật đến thứ 7) ngày và hiển thị tương ứng trong tuần lễ

import java.util.Scanner;

public class Slide40 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Nhap mot so tu 1 den 7: ");
      int ngay = sc.nextInt();

      switch (ngay) {
         case 1:
            System.out.println("Chu nhat");
            break;
         case 2:
            System.out.println("Thu hai");
            break;
         case 3:
            System.out.println("Thu ba");
            break;
         case 4:
            System.out.println("Thu tu");
            break;
         case 5:
            System.out.println("Thu nam");
            break;
         case 6:
            System.out.println("Thu sau");
            break;
         case 7:
            System.out.println("Thu bay");
            break;
         default:
            System.out.println("So khong thich hop, xin hay nhap lai!");
            break;
      }

      sc.close();
   }
}
