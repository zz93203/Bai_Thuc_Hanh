import java.util.Scanner;

public class SinhVien {
    Scanner sc = new Scanner(System.in);
    String HoTen, Nganh, NienKhoa, Lop;

    public static void main(String[] argn) throws Exception {}

    void Nhapthongtin() {
        System.out.print("Ho va ten: ");
        HoTen = sc.nextLine();
        System.out.print("Nganh: ");
        Nganh = sc.nextLine();
        System.out.print("Nien khoa: ");
        NienKhoa = sc.nextLine();
        System.out.print("Lop: ");
        Lop = sc.nextLine();
    }

    void Inthongtin() {
        System.out.println("\nSinh vien: " +HoTen);
        System.out.println("Nganh: " +Nganh);
        System.out.println("Nien khoa: " +NienKhoa);
        System.out.println("Lop: " +Lop);
    }
}