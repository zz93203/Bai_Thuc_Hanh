// Sử dụng vòng for:

public static void main(String[] args) {
    // khai báo 1 ArrayList tên arrListString
    // có kiểu là string
    ArrayList<Strring> arrListString = new ArrayList<>();

    // thêm các phần tử sd PT add()
    arrliststring.add("JAVA");
    arrliststring.add("PHP");
    arrliststring.add("C#");
    arrliststring.add("C++");

    // duyệt theo kích thước của arrListString
    // sd vòng lặp for thông thường
    // và sau đó lấy pt tại VT thứ i thông qua hàm get()
    // sau đó hiển thị g.trị pt đó ra
    System.out.println("Cac phan tu có trong arrListString la: ");
    for (int i = 0; i < arrListString.size(); i++) {
        System.out.println(arrListString.get(i) + "\t");
    }
}