# Vòng lặp

Vòng lặp có thể thực thi một khối mã nhiều lần miễn là thoả mãn được điều kiện đã chỉ định.

Vòng lặp rất tiện lợi vì chúng tiết kiệm thời gian, giảm lỗi và làm cho mã dễ đọc hơn.

---

# Vòng lặp for

Khi bạn biết chính xác số lần bạn muốn lặp qua một khối mã, hãy sử dụng vòng lặp for:

``` Java
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```
- Statement 1 được thực thi (một lần) trước khi thực thi khối mã.

- Statement 2 định nghĩa điều kiện để thực thi khối mã.

- Statement 3 được thực thi (mỗi lần) sau khi khối mã đã được thực thi.

Ví dụ: 

``` Java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```

- Statement 1 khởi tạo một biến trước khi vòng lặp bắt đầu (int i = 0).

- Statement 2 định nghĩa điều kiện để vòng lặp chạy (i phải nhỏ hơn 5). Nếu điều kiện là đúng, vòng lặp sẽ bắt đầu lại, nếu sai, vòng lặp sẽ kết thúc.

- Statement 3 tăng một giá trị (i++) mỗi lần khối mã trong vòng lặp được thực thi.

---

# Vòng lặp while

Khi bạn không biết chính xác số lần bạn muốn lặp qua một khối mã, hãy sử dụng vòng lặp while.

Vòng lặp while lặp qua một khối mã miễn là điều kiện được chỉ định là đúng:

``` Java
while (condition) {
  // code block to be executed
}
```

Khi nào condition còn trả về 'true' thì đoạn code còn được lặp lại.

Ví dụ:

``` Java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```

- Đầu tiên khởi tạo 1 biến i kiểu int với giá trị là 0 bên ngoài vòng lặp.
- Đặt điều kiện cho vòng lặp là i < 5.
- i < 5 trả về 'true' thì in i ra màn hình và tăng i lên một đơn vị, sau đó lại quay lại kiểm tra điều kiện.

---