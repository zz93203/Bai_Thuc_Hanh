package Student;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class student {
    public String FullName;
    public int Age;
    Scanner sc = new Scanner(System.in);

    public void Nhapthongtin() {
        System.out.println("FullName: ");
        FullName = sc.nextLine();
        System.out.println("Age: ");
        Age = sc.nextInt();
    }

    public void Hienthithongtin(List<student> stlist) {
        for (int i=0; i<stlist.size(); i++) {
            System.out.println(stlist.get(i).FullName);
            System.out.println(stlist.get(i).Age);
        }
    }

    public void Themmoithongtin(List<student> stlist, int n) {
        for (int i=0; i<n; i++) {
            student st = new student();
            st.Nhapthongtin();
            stlist.add(st);
        }
    }

    public void Suathongtin(List<student> stlist) {
        System.out.println("Nhap stt muon chinh sua: ");
        int stt = sc.nextInt();
        student st = new student();
        for (int i=0; i<stlist.size(); i++) {
            if (i + 1 == stt) {
                st.Nhapthongtin();
                stlist.set(i, st);
                st.Nhapthongtin();
            }
        }
    }

    public void Xoathongtin(List<student> stlist) {
        System.out.println("Nhap stt muon xoa: ");
        int stt = sc.nextInt();
        student st = new student();
        for (int i=0; i<stlist.size(); i++) {
            if (i + 1 == stt) {
                st.Nhapthongtin();
                stlist.remove(i);
                st.Hienthithongtin(stlist);
            }
        }
    }
}
