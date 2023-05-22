import java.util.Scanner;

public class contact {
    public String HoTen;
    public int SoDienThoai;
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        this.HoTen = sc.nextLine();
        System.out.print("So dien thoai: ");
        this.SoDienThoai = sc.nextInt();
        
    }

    public void ThemContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho va ten can them: ");
        String NhapTen = sc.nextLine();
        System.out.println("nhap so dien thoai ca them: ");
        int NhapSoDienThoai = sc.nextInt();
    }


    public void InThongTin() {
        System.out.println("");
    }

}
