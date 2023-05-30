import java.util.Scanner;
import java.util.ArrayList;

public class PMH048Class {
    Scanner sc = new Scanner(System.in);
    String Hoten;
    int Tuoi;
    float Diem;
    int n;

    public void NhapThongTin() {
        System.out.println("Ho va ten: ");
        Hoten = sc.nextLine();
        System.out.println("Tuoi: ");
        Tuoi = sc.nextInt();
        System.out.println("Diem: ");
        Diem = sc.nextFloat();
    }

    public void HienThi() {
        System.out.println("Ho va ten: " +Hoten);
        System.out.println("Tuoi: " +Tuoi);
        System.out.println("Diem: " +Diem);
    }

    public void ThemThongTin() {
        for (int i=0; i<n;i++) {
            PMH048Class sv = new PMH048Class();
            sv.NhapThongTin();
            sinhvien.add();
        }
    }

    public void SuaThongTin() {

    }

    public void XoaThongTin() {
        System.out.println("Nhap doi tuong can xoa: ");
        String deletename = sc.nextLine();
        for (int i=0; i<n; i++) {
            
        }
    }

    public void TimKiem() {
        System.out.println("Nhap ten can tim: ");
        String findname = sc.nextLine();
        if ()
    }
}