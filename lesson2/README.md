# Giới thiệu các cú pháp Java cơ bản.

---

## Biến và kiểu dữ liệu.

Biến dùng để lưu trữ dữ liệu.

Các kiểu dữ liệu thông dụng:

| Tên | Mô tả |
| --- | --- |
| int | Lưu trữ số nguyên. |
| long | Lưu trữ số nguyên với giới hạn lưu trữ cao hơn int. |
| float | Lưu trữ số thập phân. |
| double | Lưu trữ số thập phân với giới hạn lưu trữ cao hơn float. |
| char | Lưu trữ các ký tự đơn lẻ. |
| boolean | Lưu trữ giá trị 'true' hoặc 'false'.|
| String | Lưu trữ một chuỗi các ký tự. |

Cú pháp khai báo biến:

``` Java
KiểuDữLiệu TênBiến = GiáTrị;
```

Ví dụ:

``` Java
// Tạo một biến có tên là name thuộc kiểu String và gán cho nó giá trị "John"
String name = "John";
```

Cũng có thể khai báo một biến mà không cần gán giá trị. Ta có thể gán giá trị cho biến đó sau.

``` Java
int myNum;
myNum = 15;
```

## Câu lệnh in ra màn hình:

``` java
System.out.println();
```

## Câu lệnh lấy giá trị từ bàn phím:

``` java
// Khởi tạo đối tượng của lớp Scanner
Scanner scanner = new Scanner(System.in)

// Đọc giá trị String từ bàn phím và lưu vào biến name
String name = scanner.nextLine();
```
---

## Toán tử toán học.

| Toán tử | Mô tả |
| --- | --- |
| + | Cộng 2 giá trị lại với nhau. |
| - | Trừ 1 giá trị với một giá trị khác |
| * | Nhân 2 giá trị với nhau. |
| / | Chia 1 giá trị cho 1 giá trị khác. |
| % | Chia lấy phần dư. |
| ++ | Tăng một giá trị lên 1 đơn vị.|
| -- | Giảm một giá trị đi 1 đơn vị. |

---