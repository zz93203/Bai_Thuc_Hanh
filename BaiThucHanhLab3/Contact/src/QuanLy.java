import java.util.Scanner;

public class QuanLy {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        contact A[];
        System.out.print("Nhap vao so phan tu cua mang: ");
        int n = sc.nextInt();
        A = new contact[n];
        for (int i = 0; i < n; i++) {
            contact ct = new contact();
            ct.NhapThongTin();
            A[i] = ct;
        }

        contact ct = new contact();
        ct.ThemContact();
        
        System.out.println("Nhap ten can tim kiem: ");
        String TenTimKiem = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (A[i].HoTen.equals(TenTimKiem)) {
               System.out.printf("So dien thoai cua %s la: %d",TenTimKiem,SoDienThoai);
            }
        } 
    }
}
