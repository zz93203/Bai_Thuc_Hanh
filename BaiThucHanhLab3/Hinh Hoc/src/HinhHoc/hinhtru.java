package HinhHoc;

import java.util.Scanner;

public class hinhtru extends hinhtron {

    public float chieucao;

    // Constructor
    public hinhtru() {
        ten = "Hinh Tru";
    }

    public void Nhapchieucao() {
        NhapBanKinh();
        System.out.print("Chieu cao la: ");
        try (Scanner sc = new Scanner(System.in)) {
            chieucao = sc.nextFloat();
        }
    }

    public void Tinhthetich() {
        TinhDienTich();
        thetich = dientich * chieucao;
    }
}
