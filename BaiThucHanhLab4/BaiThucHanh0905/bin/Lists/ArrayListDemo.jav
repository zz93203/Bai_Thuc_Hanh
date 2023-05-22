// Cho phép người dùng nhập vào n đối tượng Student,
// thực hiện các chức năng Thêm, sửa, xoá, hiển thị dữ liệu trong ArrayList

package Lists

import java.util.Scanner;
import java.util.ArrayList;
import Student.student;
    
public class ArrayListDemo extends student {
    public static void main(String[] args) {
        ArrayList<student> stlist = new ArrayList <>();
        student st = new student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so doi tuong: ")
        int n = sc.nextInt();

        st.Themmoithongtin(stlist, n);
        st.Hienthithongtin();
        st.Suathongtin();
        st.Xoathongtin();
    }
}

