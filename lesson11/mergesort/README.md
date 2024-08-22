# Sắp xếp hợp nhất (Merge sort)

Sắp xếp hợp nhất là một thuật toán sắp xếp theo cách tiếp cận chia để trị . Nó hoạt động bằng cách chia mảng đầu vào thành các mảng con nhỏ hơn và sắp xếp các mảng con đó sau đó hợp nhất chúng lại với nhau để thu được mảng đã sắp xếp.

Sắp xếp hợp nhất là một thuật toán sắp xếp phổ biến được biết đến vì tính hiệu quả và ổn định của nó. Nó tuân theo cách tiếp cận chia để trị để sắp xếp một mảng các phần tử nhất định.

Dưới đây là giải thích từng bước về cách hoạt động của sắp xếp hợp nhất:

- Chia: Chia danh sách hoặc mảng theo cách đệ quy thành hai nửa cho đến khi không thể chia được nữa.

- Chinh phục: Mỗi mảng con được sắp xếp riêng lẻ bằng thuật toán sắp xếp hợp nhất.

- Hợp nhất: Các mảng con đã sắp xếp được hợp nhất lại với nhau theo thứ tự đã sắp xếp. Quá trình tiếp tục cho đến khi tất cả các phần tử từ cả hai mảng con được hợp nhất.