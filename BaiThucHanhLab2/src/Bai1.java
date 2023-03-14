import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap va so thu nhat: ");
            float a = sc.nextFloat();
            System.out.println("Nhap vao so thu hai: ");
            float b = sc.nextFloat();
            float tong = a + b;
            float hieu = a - b;
            float tich = a * b;
            float thuong = a / b;
            float chialaydu = a % b;
            System.out.println("Tong: " + tong);
            System.out.println("Hieu: " + hieu);
            System.out.println("Tich: " + tich);
            System.out.println("Thuong: " + thuong);
            System.out.println("Chialaydu: " + chialaydu);
            if (a > b) {
                System.out.println("So thu nhat lon hon");
            }
            else if(a < b) {
                System.out.println("So thu hai lon hon");
            }
            else {
                System.out.println("hai so bang mhau");
            }
        }
    }
}

