# Chuỗi (String)

Chuỗi (String) được sử dụng để lưu trữ văn bản.

Một biến kiểu String chứa một tập hợp các ký tự được bao quanh bởi dấu ngoặc kép:

``` Java
String greeting = "Hello";
```

---

# Nối chuỗi (String concatenation)

Toán tử + có thể được sử dụng giữa các chuỗi để kết hợp chúng.

Điều này được gọi là nối chuỗi:

``` Java
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);
// Outputs "John Doe"
```


# Các phương thức (methods) thao tác với chuỗi

Một String trong Java thực chất là một đối tượng, chứa các phương thức có thể thực hiện một số thao tác nhất định trên các chuỗi. 

Một số phương thức chuỗi phổ biến:

| Phương thức | Mô tả |
| --- | --- |
| length() | Trả về độ dài (số lượng ký tự) của một chuỗi. |
| charAt() | Trả về ký tự tại chỉ số (index) đã chỉ định. |
| concat() | Nối một chuỗi vào cuối một chuỗi khác. |
| equals() | So sánh hai chuỗi có giống nhau hay không. |
| isEmpty() | Kiểm tra xem chuỗi được chỉ định có phải chuỗi trống hay không. |
| replace() | Tìm kiếm một giá trị được chỉ định trong một chuỗi và trả về một chuỗi mới trong đó các giá trị được chỉ định được thay thế.|
| contains() | Kiểm tra xem trong một chuỗi có chứa một chuỗi nhỏ hơn được chỉ định hay không. |

Ví dụ, độ dài của một chuỗi có thể được tìm thấy bằng phương thức length():

``` Java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println(txt.length());
// Outputs 26
```

---