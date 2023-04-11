import java.util.Scanner;

public class HinhChuNhat {
    float d;
    float r;
    float cv;
    float dt;

    public void Nhapthongtin() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap chieu dai: ");
            d = sc.nextFloat();
            System.out.print("Nhap chieu rong: ");
            r = sc.nextFloat();
        }
    }

    public void Tinhchuvi() {
        cv = (d + r) * 2;
    }

    public void Tinhdientich() {
        dt = d * r;
    }

    public void Inthongtin() {
        System.out.println("Chu vi hinh chu nhat la: " +cv);
        System.out.println("Dien tich hinh chu nhat la: " +dt);
    }
}