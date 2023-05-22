// Sử dụng Iterator: phải import java.util.Iterator của java

public static void main(String[] args) {
    // khai báo 1 arrayList có tên là arrListString
    // có kiểu là String
    ArrayList<String> arrListString = new ArrayList<>();

    // thêm các pt sd pt adđ()
    // chữ f cho biết các số thêm vào là số thực
    // nếu ko có chữ này thì trình biên dịch sẽ hiểu đây là số double
    // và sẽ báo là lỗi dữ liệu
    arrListFloat.add(0.7f);
    arrListFloat.add(7.26f);
    arrListFloat.add(1.02f);
    arrListFloat.add(9.3f);

    // khai báo 1 Iterator có kiểu là float
    Iterator<Float> iterator = arrListFloat.iterator();

    System.out.println("Cac phan tu có trong arrListFloat la: ");
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + "\t");
    }
}