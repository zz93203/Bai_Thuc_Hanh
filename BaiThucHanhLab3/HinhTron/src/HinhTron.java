import java.util.Scanner;

public class HinhTron {
    Scanner sc = new Scanner(System.in);
    final float pi = 3.14f;
    float r;
    float cv;
    float dt;

    public static void main(String[] argn) throws Exception {}

    void Nhapbankinh() {
        System.out.print("Nhap vao ban kinh hinh tron: ");
        r = sc.nextFloat();
    }

    void Tinhchuvi() {
        cv = 2 * pi * r;
    }

    void InChuvi() {
        System.out.println("Chu vi cua hinh tron la: " +cv);
    }

    void Tinhdientich() {
        dt = pi * r * r;
    }

    void InDientich() {
        System.out.println("Dien tich cua hinh tron la: " +dt);
    }
    
}
