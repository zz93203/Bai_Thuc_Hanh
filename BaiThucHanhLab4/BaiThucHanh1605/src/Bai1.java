import java.util.Scanner;
import java.util.ArrayList;

public class Bai1 {
    private ArrayList<Integer> bai1 = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void Nhap() {
        System.out.print("Nhap so phan tu cua day: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            int number = sc.nextInt();
            bai1.add(number);
        }
    }

    public void Hienthi() {
        System.out.println("Cac phan tu trong day la: ");
        for (int i = 0; i < bai1.size(); i++) {
            System.out.println("Phan tu thu "+(i+1)+" la: " + bai1.get(i));
        }
    }

    public void Timmax() {
        int max = bai1.get(0);
        for (int i = 1; i < bai1.size(); i++) {
            if (bai1.get(i).compareTo(max) > 0) {
                max = bai1.get(i);
            }
        }
        System.out.println("Phan tu co gia tri lon nhat la: " + max);
    }

    public void Xoaphantu() {
        int Socantim;
        System.out.print("Nhap phan tu can xoa: ");
        Socantim = sc.nextInt();
        for (Integer nb : bai1) {
            if (Socantim == nb) {
                bai1.remove(nb);
                System.out.printf("Day sau khi xoa phan tu %d la: ", nb);
                System.out.println();
                break;
            }
        }
    }

    public void Sapxep() {
        bai1.sort(null);
        for (int i = 0; i < bai1.size(); i++) {
            System.out.println("Day sau khi sap xep la: " + bai1.get(i));
        }
    }

    public static void main(String[] args) {
        Bai1 B1 = new Bai1();
        B1.Nhap();
        B1.Hienthi();
        B1.Timmax();
        B1.Xoaphantu();
        B1.Hienthi();
        B1.Sapxep();
    }
}