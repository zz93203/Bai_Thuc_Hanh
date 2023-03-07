// Viết chương trình hiển thị các số chia hết cho 5 trong phạm vi từ 0 đến 200.

import java.util.Scanner;

public class Slide55 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        System.out.println("Cac so chia het cho 5 tu 0 den 200 la:");
        for(int i=0;i<=200;i++){
            if(i %5 == 0){
                System.out.println(i);
            }
        }
    }
}
