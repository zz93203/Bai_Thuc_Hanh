import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        try {    
            do {
                System.out.print("Nhap vao so luong cua mang: ");
                n = sc.nextInt();
            } while (n<0);

            int A[] = new int[n];
            for (int i=0; i<A.length; i++) {
                System.out.print("Nhap gia tri thu "+(i+1)+" cua mang: ");
                A[i] = sc.nextInt();
            }
            
            System.out.println();
            System.out.println("Mang vua tao la: ");
            for (int i=0; i<A.length; i++) {
                System.out.print(A[i] + "\t");
            }
        }
        catch (Exception ex) {
            System.out.println("Nhap sai du lieu, xin hay nhap lai:");
        }
    
    }
}
