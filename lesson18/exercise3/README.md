# Quản lý công việc với Đa hình (Polymorphism)

1. Xây dựng lớp Task với các thuộc tính:

- taskName (tên công việc)
- taskDescription (mô tả công việc)

Phương thức:

- Tạo phương thức khởi tạo để khởi tạo giá trị cho các thuộc tính.

- Tạo phương thức performTask() in ra thông điệp "Performing a generic task".

2. Sau đó, tạo các lớp CodingTask và DesignTask kế thừa từ Task, và ghi đè phương thức performTask():

- CodingTask: in ra "Performing a coding task".
- DesignTask: in ra "Performing a design task".