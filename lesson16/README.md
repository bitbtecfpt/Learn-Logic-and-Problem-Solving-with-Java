# Lập trình hướng đối tượng

Lập trình hướng đối tượng (Object-Oriented Programming - OOP) là một phương pháp lập trình tập trung vào việc sử dụng các "đối tượng" trong mã nguồn. Các đối tượng này là những thực thể có thể chứa dữ liệu (dưới dạng thuộc tính - attributes) và các phương thức (methods) để xử lý dữ liệu đó.

## Lớp (Class) và đối tượng (Object)

Lớp và đối tượng là hai khía cạnh chính của lập trình hướng đối tượng.

- Lớp là một mẫu (template) cho các đối tượng. Nó định nghĩa các thuộc tính và phương thức mà đối tượng thuộc lớp đó có thể sử dụng.

Cách khởi tạo một Class:

``` Java
// Khởi tạo một lớp đặt tên là Fruit với thuộc tính color
public class Fruit {
  String color = "Yellow";
}
```

- Đối tượng là một thực thể cụ thể của một lớp. Khi một lớp được định nghĩa, ta có thể tạo ra nhiều đối tượng từ lớp đó. Mỗi đối tượng là một phiên bản của lớp với các giá trị thuộc tính cụ thể.

Cách tạo ra Objects của một Class:

``` Java
public class Fruit {
  String color = "Yellow";

  public static void main(String[] args) {
    // Tạo ra một Object đặt tên là Orange (Quả cam) thuộc lớp Fruit (Hoa quả)
    Fruit Orange = new Fruit();
  }
}
```

**Ví dụ:** Chúng ta có một lớp là Fruit, các đối tượng thuộc lớp này có thể là Apple, Orange, Banana,...

## Thuộc tính (Attributes) và phương thức (Methods)

**Thuộc tính** là các biến được định nghĩa bên trong một lớp, dùng để lưu trữ trạng thái hoặc dữ liệu của các đối tượng. Mỗi đối tượng được tạo ra từ lớp sẽ có một bản sao riêng của các thuộc tính này, và các thuộc tính có thể có các giá trị khác nhau cho các đối tượng khác nhau.

**Ví dụ:** Khởi tạo một Class tên Car (Xe ô tô), mỗi chiếc xe có thể có các thuộc tính như màu sắc, số chỗ ngồi, năm sản xuất, hãng sản xuất,.. Các thuộc tính này sẽ được khai báo trong Car, mà mỗi đối tượng cụ thể của Car sẽ có các giá trị khác nhau cho các thuộc tính trên.

**Phương thức** là các hàm (Function) được định nghĩa bên trong một lớp, dùng để thực hiện các hành động hoặc thao tác liên quan đến đối tượng. Phương thức có thể truy cập và thay đổi các thuộc tính của đối tượng.

**Ví dụ:** Với Class Car, một chiếc xe có thể thực hiện các hành động như khởi động xe, đi thẳng, đi lùi, rẽ phải,... Đó chính là các phương thức có thể có cho mỗi chiếc xe ô tô hay nói cách khác là mỗi đối tượng của lớp Car.

## Các tính chất của Lập trình hướng Đối tượng

**Tính đóng gói (Encapsulation):** Tính chất này đề cập đến việc gói gọn dữ liệu và các phương thức (hàm) liên quan đến dữ liệu đó vào trong một đối tượng. Nhờ đó, các chi tiết bên trong đối tượng được ẩn đi và chỉ cung cấp một giao diện bên ngoài để tương tác. Điều này giúp bảo vệ dữ liệu và giảm thiểu sự phụ thuộc giữa các phần của chương trình.

**Tính kế thừa (Inheritance):** Tính kế thừa cho phép một lớp (class) mới có thể kế thừa các thuộc tính và phương thức từ một lớp đã có. Điều này giúp tái sử dụng mã nguồn và tạo ra các mối quan hệ phân cấp giữa các lớp.

**Tính đa hình (Polymorphism):** Tính đa hình cho phép một phương thức hoặc một đối tượng có thể có nhiều hình thức khác nhau. Ví dụ, một phương thức có thể được thực hiện theo các cách khác nhau dựa trên đối tượng gọi nó, hoặc một đối tượng có thể được xử lý theo nhiều cách khác nhau dựa trên ngữ cảnh.
 
**Tính trừu tượng (Abstraction):** Tính trừu tượng cho phép ẩn đi các chi tiết phức tạp và chỉ tập trung vào các khía cạnh cần thiết. Nó giúp đơn giản hóa quá trình phát triển phần mềm bằng cách cho phép lập trình viên làm việc với các khái niệm cấp cao hơn thay vì chi tiết cụ thể.