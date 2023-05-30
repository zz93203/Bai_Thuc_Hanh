package Bai5;

import java.util.Scanner;

public class SV {
    Scanner sc = new Scanner(System.in);
    String MSV;
    String HoTen;
    String Lop;

    public void Nhap() {
        System.out.print("\nMa sinh vien: ");
        MSV = sc.nextLine();
        System.out.print("Ho va ten: ");
        HoTen = sc.nextLine();
        System.out.print("Lop: ");
        Lop = sc.nextLine();
    }

    public void Hienthi() {
        System.out.println("Ma sinh vien: " +MSV);
        System.out.println("Ho va ten: " +HoTen);
        System.out.println("Lop: " +Lop);
    }
}
