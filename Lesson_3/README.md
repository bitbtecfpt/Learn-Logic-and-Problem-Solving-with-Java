# Câu lệnh điều kiện.

Câu lệnh điều kiện trong Java được sử dụng để thực hiện các thao tác khác nhau dựa trên các điều kiện khác nhau.

---

# Toán tử so sánh, Logic.

Toán tử so sánh được sử dụng để so sánh hai giá trị (hoặc biến). Điều này rất quan trọng trong lập trình vì nó giúp chúng ta tìm ra câu trả lời và đưa ra quyết định.

Giá trị trả về của phép so sánh là true hoặc false. Những giá trị này được gọi là giá trị Boolean

## Toán tử so sánh:

| Toán tử | Mô tả|
| --- | ---|
| == | So sánh bằng giữa 2 giá trị, trả về true nếu 2 giá trị là bằng nhau. |
| != | So sánh khác giữa 2 giá trị, trả về true nếu 2 giá trị là khác nhau. |
| > | So sánh lớn hơn, trả về true nếu giá trị thứ nhất lớn hơn giá trị thứ 2. |
| < | So sánh nhỏ hơn, trả về true nếu giá trị thứ nhất nhỏ hơn giá trị thứ 2. |
| >= | So sánh lớn hơn hoặc bằng, trả về true nếu giá trị thứ nhất lớn hơn hoặc bằng giá trị thứ 2. |
| <= | So sánh nhỏ hơn, trả về true nếu giá trị thứ nhất nhỏ hơn hoặc bằng giá trị thứ 2. |

## Toán tử Logic:

Ta cũng có thể kiểm tra giá trị đúng hoặc sai bằng toán tử logic.

| Toán tử | Mô tả|
| --- | ---|
| && | Toán tử 'và', chỉ trả về true nếu 2 vế cùng true. |
| \|\| | Toán tử 'hoặc', trả về true nếu 1 trong 2 vế là true. |
| ! | Toán tử 'không', trả về true nếu giá trị áp dụng là false. |

---

# Câu lệnh điều khiển (if, else if, else, switch).

## if, else if, else:

Cú pháp câu lệnh if:
``` java
if (condition) {
  // mã trong đây sẽ chạy nếu condition trả về true.
}
```

Ta có thể sử dụng câu lệnh else để chỉ định  mã sẽ được thực thi nếu condition trả về false.

``` java
if (condition) {
  // mã trong đây sẽ chạy nếu condition trả về true.
} else {
  // mã trong đây sẽ chạy nếu condition trả về false.
}
```

Ta có thể sử dụng câu lệnh else if để chỉ định điều kiện mới nếu điều kiện đầu tiên trả về false.

``` java
if (condition1) {
  // mã trong đây sẽ chạy nếu condition1 trả về true.
} else if (condition2) {
  // mã trong đây sẽ chạy nếu condition2 trả về true.
} else {
  // mã trong đây sẽ chạy nếu mọi condition đều trả về false.
}
```

## switch:

Thay vì viết nhiều câu lệnh if..else, ta có thể sử dụng câu lệnh switch.
Câu lệnh switch sẽ chọn một trong nhiều khối mã để thực thi

``` java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```

Đây là cách switch hoạt động:

- expression được kiểm tra một lần.
- Giá trị của biểu thức được so sánh với giá trị của từng case.
- Nếu có sự trùng khớp, khối mã liên quan sẽ được thực thi.
- Nếu không có sự trùng khớp, khối mã trong default sẽ được thực thi.

---
