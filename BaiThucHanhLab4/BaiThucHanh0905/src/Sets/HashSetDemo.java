package Sets;

import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import Student.student;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<student> hashSet = new HashSet<>();
        student st = new student();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so luong sinh vien: ");
        n = sc.nextInt();
        for (int i=0; i<=n; i++) {
            student std = new student();
            System.out.println("Nhap sinh vien thu "+(i+1)+": ");
            st.Nhapthongtin();
            hashSet.add(std);
        }
        st.Hienthithongtin(hashSet);
        st.Suathongtin(hashSet);
        st.Xoathongtin(hashSet);
    }
}
