// Cho phép người dùng nhập vào n đối tượng Student, 
// thực hiện các chức năng Thêm, sửa, xoá, hiển thị dữ liệu trong ArrayList

package Lists;

import java.util.LinkedList;
import java.util.Scanner;
import Student.student;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<student> stlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        student st = new student();

        System.out.println("Nhap vao so hoc sinh: ");
        int n = sc.nextInt();

        st.Themmoithongtin(stlist, n);
        st.Hienthithongtin(stlist);
        st.Suathongtin(stlist);
        st.Xoathongtin(stlist);
    }
}
