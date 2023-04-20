package main;

import HinhHoc.hinhchunhat;
import HinhHoc.hinhtron;
import HinhHoc.hinhtru;
import HinhHoc.hinhvuong;

public class mainclass {
    
    public static void main(String[] args) {
        // Thử nghiệm với lớp hình tròn
        hinhtron ht = new hinhtron();
        ht.XuatTen();
        ht.NhapBanKinh();
        ht.TinhChuVi();
        ht.TinhDienTich();
        ht.InChuVi();
        ht.InDienTich();

        // Thử nghiệm với lớp hình trụ
        hinhtru htr = new hinhtru();
        htr.XuatTen();
        htr.Nhapchieucao();
        htr.Tinhthetich();
        htr.InTheTich();

        // Thử nghiệm với lớp hình chữ nhật
        hinhchunhat hcn = new hinhchunhat();
        hcn.XuatTen();
        hcn.NhapChieuDai();
        hcn.NhapChieuRong();
        hcn.TinhChuVi();
        hcn.TinhDienTich();
        hcn.InChuVi();
        hcn.InDienTich();

        // Thử nghiệm với lớp hình vuông
        hinhvuong hv = new hinhvuong();
        hv.XuatTen();
        hv.NhapCanh();
        hv.TinhChuVi();
        hv.TinhDienTich();
        hv.InChuVi();
        hv.InDienTich();

    }
}
