// Viết chương trình in ra 20 số nguyên dương đầu tiên ra màn hình.

import java.util.Scanner;
public class Bai7 {
    public static void main(String[] argn) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
        }
        for (int i = 1; i <= 20; i++) {
            System.out.println("" +i);
        }
    }
}