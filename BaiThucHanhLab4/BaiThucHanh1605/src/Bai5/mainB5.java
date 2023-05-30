package Bai5;

import java.util.Scanner;
import java.util.HashMap;

public class mainB5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, SV> DSSV = new HashMap<>();

        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.print("Sinh vien thu "+(i+1)+": ");
            SV sv = new SV();
            sv.Nhap();
            // Lưu trữ DSSV trong map để tìm kiếm theo msv(ko bị trùng lặp)
            DSSV.put(sv.MSV, sv);
        }

        // Nhạp tên lớp và hiển thị DS tt
        System.out.print("\nNhap ten lop: ");
        String TenLop = sc.nextLine();
        System.out.println();
        System.out.println("Danh sach sinh vien thuoc lop "+TenLop+" la: ");
        for (SV sv : DSSV.values()) { //  lặp qua tất cả các giá trị (values) trong Map DSSV và gán chúng cho biến sv có kiểu SV.
            if (sv.Lop.equals(TenLop)) {
                sv.Hienthi();
                System.out.println();
            }
        }

        // Nhập msv và hiển thị tt
        System.out.print("\nNhap ma sinh vien: ");
        String findMSV = sc.nextLine();
        SV findSV = DSSV.get(findMSV);
        if (findSV != null) {
            System.out.println("Thong tin sinh vien: ");
            findSV.Hienthi();
        }
        else {
            System.out.println("Khong tim thay sinh vien trong danh sach!");
        }       
    }
}
