import java.util.Scanner;
import java.util.LinkedList;

public class Bai2 {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> bai2 = new LinkedList<>();
    int number;
    int n;

    public void Nhap() {
        System.out.print("Nhap so luong phan tu: ");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            number = sc.nextInt();
            bai2.add(number);
        }
    }

    public void Hienthi() {
        System.out.println("Cac phan tu trong list la: ");
        for (int i=0; i<bai2.size(); i++) {
            System.out.println("Phan tu thu "+(i+1)+" la: " +bai2.get(i));
        }
    }

    public void Tinhtrungbinh() {
        int tong=0;
        int count=0; //đếm số lượng số chẵn
        for (Integer nb : bai2) {
            if (nb %2 == 0) {
                tong = tong + nb;
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("Khong co so chan nao trong danh sach!");
        }
        else {
            tong=tong/count;
            System.out.println("Trung binh cong cac so chan trong danh sach la: " +tong);
        }
    }

    public static void main(String[] args) {
        Bai2 B2 = new Bai2();
        B2.Nhap();
        B2.Hienthi();
        B2.Tinhtrungbinh();
    }
}