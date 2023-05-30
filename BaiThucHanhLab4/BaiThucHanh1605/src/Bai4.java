import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class Bai4 {
    public static void main(String[] args) {
        HashSet<String> DS1 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String Traicay;
        System.out.print("Nhap vao so luong cac loai trai cay: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.print("Loai trai cay thu "+(i+1)+": ");
            Traicay = sc.nextLine();
            DS1.add(Traicay);
        }
        
        // Hiển thị các phần tử
        System.out.print("Danh sach cac loai trai cay la: ");
        System.out.println(DS1);

        System.out.print("So luong trai cay trong danh sach la: ");
        System.out.println(DS1.size());

        // Tìm kiếm
        System.out.print("Nhap ten trai cay muon tim kiem: ");
        String findTraicay = sc.nextLine();
        if (DS1.contains(findTraicay)) {
            System.out.printf("Danh sach da co %s",findTraicay);
            System.out.println();
        }
        else {
            System.out.printf("Danh sach khong co %s",findTraicay);
            System.out.println();
        }

        // Xóa 1 loại trái cây
        System.out.println("Nhap ten trai cay muon xoa: ");
        String Traicaycanxoa = sc.nextLine();
        if (DS1.contains(Traicaycanxoa)) {
            DS1.remove(Traicaycanxoa);
            System.out.printf("Da xoa "+Traicaycanxoa+" khoi danh sach!");
            System.out.println("Danh sach trai cay con lai la: ");
            System.out.println(DS1);
        }
        else {
            System.out.println("Danh sach khong co trai cay can xoa!");
            System.out.println();
        }

        // Tạo 1 danh sách mới
        HashSet<String> DS2 = new HashSet<>();
        String Traicay2;
        System.out.print("Nhap vao so luong cac loai trai cay trong DS2: ");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.print("Loai trai cay thu "+(i+1)+": ");
            Traicay2 = sc.nextLine();
            DS1.add(Traicay2);
        }

        // Thêm vào HashSet ban đầu
        Iterator<String> them = DS2.iterator();
        while(them.hasNext()) {
            String str= them.next();
            DS1.add(str);
        }
        System.out.println("Danh sach cac loai trai cay sau thi them DS2 la: ");
        System.out.println(DS1);

        // Xóa các pt của DS2 khỏi DS1
        DS1.removeAll(DS2);
        System.out.println("Danh sach sau khi xoa la: ");
        System.out.println(DS1);
        System.out.println();
    }
}
