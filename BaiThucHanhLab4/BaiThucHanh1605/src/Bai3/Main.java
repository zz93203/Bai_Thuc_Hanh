package Bai3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<SinhVien> stlist = new ArrayList<>();
            SinhVien sv = new SinhVien();
            int n = sc.nextInt();

            for (int i=0; i<n; i++) {
                SinhVien st = new SinhVien();
                System.out.print("Nhap sinh vien thu "+(i+1)+": ");
                st.Nhap();
                if (st.Ten.isEmpty()) {
                    break;
                }
                stlist.add(st);
            }

            System.out.println();
            sv.Hienthi(stlist);

            System.out.println();
            sv.Dem(stlist);

            System.out.println();
            sv.Diemcao(stlist);

            System.out.println();
            sv.Timkiem(stlist);
        }
    }
}
