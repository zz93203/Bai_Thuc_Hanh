package Bai3;

import java.util.Scanner;
import java.util.ArrayList;

public class SinhVien {
    Scanner sc = new Scanner(System.in);
    public String Ten;
    public float Diem;

    public void Nhap() {
        System.out.print("Ten sinh vien: ");
        Ten = sc.nextLine();
        System.out.print("Diem cua sinh vien: ");
        Diem = sc.nextFloat(); 
    }

    public void Hienthi(ArrayList<SinhVien> stlist) {
        System.out.println("Danh sach sinh vien: ");
        for (int i=0; i<stlist.size(); i++) {
            System.out.println("Sinh vien thu "+(i+1)+" la: ");
            System.out.println();
            System.out.print("Ho va ten: " +stlist.get(i).Ten);
            System.out.println();
            System.out.print("Diem: " +stlist.get(i).Diem);
            System.out.println();
        }
    }

    // đếm số sinh viên phải thi lại
    public void Dem(ArrayList<SinhVien> stlist) {
        int count = 0;
        System.out.println("Danh sach sinh vien phai thi lai la: ");
        for (int i=0; i<stlist.size(); i++) {
            if (stlist.get(i).Diem <= 5) {
                count ++;
                System.out.println("Sinh vien stt "+(i+1)+": ");
                System.out.println(stlist.get(i).Ten);
                System.out.println(stlist.get(i).Diem);
            }
        }
        System.out.println("So sinh vien thi lai la: " +count);
        System.out.println();
    }

    public void Diemcao(ArrayList<SinhVien> stlist) {
        float maxDiem = stlist.get(0).Diem;
        String nameDiemcao = stlist.get(0).Ten;
        System.out.println("Cac sinh vien co diem cao nhat la: ");
        for (int i=0; i<stlist.size(); i++) {
            if (stlist.get(i).Diem > maxDiem) {
                maxDiem = stlist.get(i).Diem;
                nameDiemcao = stlist.get(i).Ten;
            }
        }
        System.out.println("Ho va ten: " +nameDiemcao);
        System.out.println("Diem: " +maxDiem);
    }

    public void Timkiem(ArrayList<SinhVien> stlist) {
        String findName;
        System.out.println("Nhap ten sinh vien can tim: ");
        findName = sc.nextLine();
        for (int i=0; i<stlist.size(); i++) {
            if (findName.equals(stlist.get(i).Ten)) {
                System.out.println("Sinh vien ban vua tim co thong tin la: ");
                System.out.println("Ho va ten: " +stlist.get(i).Ten);
                System.out.println("Diem: " +stlist.get(i).Diem);
                return;
            }
        }
    }

}
