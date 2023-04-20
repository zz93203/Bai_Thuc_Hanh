package HinhHoc;

import java.util.Scanner;

public class hinhtron extends hinhhoc {

    public float bankinh;

    // Constructor
    public hinhtron() {
        ten = "Hinh Tron";
    }

    public void NhapBanKinh() {
        System.out.print("Ban kinh la: ");
        try (Scanner sc = new Scanner(System.in)) {
            bankinh = sc.nextFloat();
        }
    }

    public void TinhChuVi() {
        chuvi = 2*pi*bankinh;
    }

    public void TinhDienTich() {
        dientich = pi * bankinh * bankinh;
    }

}