# Đánh giá năng lực

## Hệ thống quản lý khách sạn

**Đề bài:** Xây dựng các lớp Room và Guest để mô phỏng hệ thống quản lý khách sạn.

Chi tiết:

Lớp Room có các thuộc tính:

- roomNumber (số phòng)
- roomType (loại phòng: đơn, đôi, suite)
- price (giá phòng)
- isAvailable (trạng thái còn trống)

Lớp Guest có các thuộc tính:

- guestName (tên khách)
- contactInfo (thông tin liên hệ)
- room (phòng đã đặt, là đối tượng của lớp Room)

Phương thức:

Lớp Room:

- bookRoom() để đặt phòng, thay đổi trạng thái isAvailable thành false.

- cancelBooking() để hủy đặt phòng, đổi lại trạng thái isAvailable thành true.

Lớp Guest:

- checkIn(Room room) để khách nhận phòng.

- checkOut() để khách trả phòng.

Yêu cầu:

- Xây dựng một lớp HotelManagement để quản lý việc đặt và trả phòng, tìm kiếm phòng trống theo loại.