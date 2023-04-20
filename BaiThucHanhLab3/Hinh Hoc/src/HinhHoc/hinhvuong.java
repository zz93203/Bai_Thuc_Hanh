package HinhHoc;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat {

    // Constructor
    public hinhvuong() {
        ten = "Hinh vuong";
    }

    public void NhapCanh() {
        System.out.print("Canh la: ");
        try (Scanner sc = new Scanner(System.in)) {
            dai = rong = sc.nextFloat();
        }
    }
}