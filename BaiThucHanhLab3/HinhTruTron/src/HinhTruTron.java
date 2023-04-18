import java.util.Scanner;

public class HinhTruTron {
    final float pi = 3.14f;
    float r;
    float h;
    float dtxq;
    float dttp;
    float tt;

    public void Nhapthongtin() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap vao ban kinh: ");
            r = sc.nextFloat();
            System.out.print("Nhap chieu cao: ");
            h = sc.nextFloat();
        }
    }

    public void Tinhdientichxungquanh() {
        dtxq = 2*pi*r*h;
    }

    public void Tinhdientichtoanphan() {
        dttp = 2*pi*r*r + 2*pi*r*h;
    }

    public void Tinhthetich() {
        tt = pi*r*r*h;
    }

    public void Inthongtin() {
        System.out.println("Dien tich xung quanh hinh tru tron la: " +dtxq);
        System.out.println("Dien tich toan phan hinh tru tron la: " +dttp);
        System.out.println("The tich hinh tru tron la: " +tt);
    }
}