# Sắp xếp chèn (Insertion sort)

Sắp xếp chèn là một thuật toán sắp xếp đơn giản hoạt động bằng cách lặp lại việc chèn từng phần tử của một danh sách chưa được sắp xếp vào đúng vị trí của nó trong phần đã được sắp xếp của danh sách.

Để thực hiện sắp xếp chèn, hãy làm theo các bước sau:

- Chúng ta bắt đầu với phần tử thứ hai của mảng vì phần tử đầu tiên trong mảng được coi là đã được sắp xếp.

- So sánh phần tử thứ hai với phần tử đầu tiên và kiểm tra xem phần tử thứ hai có nhỏ hơn không rồi hoán đổi chúng.

- Di chuyển đến phần tử thứ ba và so sánh nó với phần tử thứ hai, sau đó là phần tử đầu tiên và hoán đổi nếu cần để đặt nó vào đúng vị trí.

- Tiếp tục quá trình này, so sánh từng phần tử với các phần tử trước nó và hoán đổi nếu cần để đặt nó vào đúng vị trí trong số các phần tử đã được sắp xếp.

- Lặp lại cho đến khi toàn bộ mảng được sắp xếp.