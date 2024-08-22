# Cơ bản về chia để trị và đệ quy trong lập trình

---

## Chia để trị (Divide and Conquer)

Chia để trị là một chiến lược giải quyết vấn đề bằng cách chia vấn đề lớn thành các vấn đề con nhỏ hơn, giải quyết từng vấn đề con, sau đó kết hợp kết quả để giải quyết vấn đề ban đầu. 

Chiến lược này thường áp dụng cho các thuật toán đệ quy.

---

## Đệ quy (Recursion)

Đệ quy là một kỹ thuật trong lập trình mà trong đó một hàm tự gọi lại chính nó để giải quyết một bài toán bằng cách chia nhỏ bài toán đó thành các bài toán con đơn giản hơn. 

Đệ quy có thể hơi khó hiểu. Cách tốt nhất để tìm ra cách thức hoạt động của nó là thử nghiệm.

---

## Ví dụ của đệ quy

Việc cộng hai số lại với nhau thì dễ, nhưng việc cộng một dãy số thì phức tạp hơn. 

Trong ví dụ sau, đệ quy được sử dụng để cộng một dãy số lại với nhau bằng cách chia nhỏ thành nhiệm vụ đơn giản là cộng hai số:

``` Java
public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
```

Giải thích:

Khi hàm sum() được gọi, nó sẽ thêm tham số k vào tổng của tất cả các số nhỏ hơn k và trả về kết quả. Khi k bằng 0, hàm chỉ trả về 0. Khi chạy, chương trình thực hiện theo các bước sau:

```
10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
-> 55
```

---

## Điều kiện dừng

Cũng giống như vòng lặp có thể gặp phải vấn đề về vòng lặp vô hạn, các hàm đệ quy có thể gặp phải vấn đề về đệ quy vô hạn. 

Đệ quy vô hạn là khi hàm không bao giờ ngừng gọi chính nó. 

Mọi hàm đệ quy đều phải có điều kiện dừng, đó là điều kiện mà hàm dừng gọi chính nó. 

Trong ví dụ trước, điều kiện dừng là khi tham số k trở thành 0.