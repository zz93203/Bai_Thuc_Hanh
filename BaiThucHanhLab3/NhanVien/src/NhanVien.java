import java.util.Scanner;

public class NhanVien {
    Scanner sc = new Scanner(System.in);
    final int LuongCoBan = 1490000;
    String HoTen;
    int NamSinh;
    double HeSoLuong;
    double Luong;

    public static void main(String[] argn) throws Exception {}

    void Nhapthongtin() {
        System.out.print("Ho va ten: ");
        HoTen = sc.nextLine();
        System.out.print("Nam sinh: ");
        NamSinh = sc.nextInt();
        System.out.print("He so luong: ");
        HeSoLuong = sc.nextDouble();
    }

    void Tinhluong() {
        Luong = LuongCoBan * HeSoLuong;
    }

    void Inthongtin() {
        System.out.printf("Luong cua nhan vien %s - %d la: %f",HoTen,NamSinh,Luong);
    }

}
