package HinhHoc;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc {

    public float dai;
    public float rong;

    // Constructor
    public hinhchunhat() {
        ten = "Hinh chu nhat";
    }

    public void NhapChieuDai() {
        System.out.print("Chieu dai la: ");
        try (Scanner sc = new Scanner(System.in)) {
            dai = sc.nextFloat();
        }
    }

    public void NhapChieuRong() {
        System.out.print("Chieu rong la: ");
        try (Scanner sc = new Scanner(System.in)) {
            rong = sc.nextFloat();
        }
    }

    public void TinhChuVi() {
        chuvi = 2 * (dai + rong);
    }

    public void TinhDienTich() {
        dientich = dai * rong;
    }
}