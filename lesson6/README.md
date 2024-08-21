# Mảng

Mảng được sử dụng để lưu trữ nhiều giá trị trong một biến duy nhất, thay vì khai báo các biến riêng biệt cho từng giá trị.

---

## Khai báo mảng

Cú pháp khai báo mảng:

``` Java
// Khai báo một mảng tên cars có số lượng phần tử là 4
String[] cars = new String[4];
```

Để chèn giá trị vào mảng trực tiếp khi khai báo, bạn có thể đặt các giá trị bên trong dấu ngoặc nhọn, ngăn cách bởi dấu phẩy:

``` Java
String cars = {"Volvo", "BMW", "Ford", "Mazda"};

int[] myNum = {10, 20, 30, 40};
```

---

## Đặc tính của mảng

**Cố định kích thước:** Kích thước (số lượng phần tử) của mảng được xác định khi tạo ra và không thể thay đổi trong suốt quá trình chạy chương trình.

**Kiểu dữ liệu đồng nhất:** Mảng chỉ có thể chứa các phần tử có cùng kiểu dữ liệu, như int, double, String, v.v.

**Chỉ số (index):** Các phần tử trong mảng có thứ tự cố định và được xác định bởi chỉ số (index). Phần tử đầu tiên nằm tại index 0, phần tử thứ 2 nằm tại index 1 và cứ như vậy cho đến phần tử cuổi cùng.

---

## Truy cập phần tử trong mảng

Bạn có thể truy cập một phần tử mảng bằng cách tham chiếu đến chỉ số của phần tử đó.

Câu lệnh này truy cập giá trị của phần tử đầu tiên trong mảng cars:

``` Java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
```

---

## Thay đổi giá trị của 1 phần tử trong mảng

Để thay đổi giá trị của một phần tử cụ thể trong mảng, hãy tham chiếu đến chỉ số của phần tử đó và gán một giá trị mới:

``` Java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// Gán lại giá trị cho phần tử tại index 0 (Volvo)
cars[0] = "Opel";
System.out.println(cars[0]);
// Outputs Opel (Vì Volvo đã được thay thế bằng Opel)
```

---