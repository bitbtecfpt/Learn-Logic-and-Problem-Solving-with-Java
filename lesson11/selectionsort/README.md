# Sắp xếp chọn (Selection sort)

Sắp xếp chọn là một thuật toán sắp xếp đơn giản và hiệu quả hoạt động bằng cách chọn phần tử nhỏ nhất (hoặc lớn nhất) từ phần chưa được sắp xếp của mảng và di chuyển nó đến phần đã được sắp xếp của mảng.

Quá trình này được lặp lại đối với phần chưa được sắp xếp còn lại cho đến khi toàn bộ mảng được sắp xếp.

Sau đây là tổng quan từng bước về cách thức hoạt động của nó:

- Bắt đầu với phần tử đầu tiên của danh sách.

- Quét các phần tử chưa được sắp xếp còn lại để tìm giá trị nhỏ nhất.

- Hoán đổi giá trị nhỏ nhất này với phần tử ở vị trí hiện tại.

- Di chuyển vị trí bắt đầu về phía trước một bước và lặp lại quy trình cho đến khi toàn bộ danh sách được sắp xếp.