# Thuật toán

Thuật toán là một tập hợp các quy tắc hoặc chỉ dẫn cần tuân theo để giải quyết một vấn đề cụ thể. Thuật toán có thể được biểu diễn bằng nhiều cách khác nhau như mô tả văn bản, sơ đồ khối, hoặc mã nguồn trong một ngôn ngữ lập trình.

Các đặc điểm chính của một thuật toán:

- **Đầu vào (Input):** Một thuật toán có thể có một hoặc nhiều giá trị đầu vào.

- **Đầu ra (Output):** Sau khi thực hiện, thuật toán phải trả về ít nhất một giá trị đầu ra.

- **Tính xác định (Definiteness):** Các bước của thuật toán phải rõ ràng, không có sự mơ hồ.

- **Tính hữu hạn (Finiteness):** Thuật toán phải kết thúc sau một số hữu hạn các bước.

- **Tính hiệu quả (Efficiency):** Thuật toán phải sử dụng tài nguyên (thời gian, bộ nhớ) một cách hiệu quả.

# Độ phức tạp của thuật toán

Độ phức tạp của thuật toán đo lường mức độ tài nguyên mà một thuật toán cần để thực hiện nhiệm vụ của mình. Nó thường được đánh giá theo hai yếu tố chính:

## Độ phức tạp thời gian

**Độ Phức Tạp Thời Gian:** Đo lường số lượng phép toán hoặc bước tính toán cần thiết để hoàn thành thuật toán. Được thể hiện theo hàm số lượng phần tử đầu vào (n), ví dụ như O(n), O(n^2), O(log n), etc.

**- O(1):** Thời gian thực hiện không thay đổi theo kích thước đầu vào (thời gian hằng số).
**- O(n):** Thời gian thực hiện tỷ lệ thuận với kích thước đầu vào.
**- O(n^2):** Thời gian thực hiện tỷ lệ với bình phương kích thước - đầu vào.
**- O(log n):** Thời gian thực hiện tỷ lệ thuận với logarit của kích thước đầu vào (thường gặp trong các thuật toán tìm kiếm nhị phân).

## Trường hợp đánh giá độ phức tạp thời gian

Khi đánh giá độ phức tạp thời gian của thuật toán, có một số trường hợp quan trọng cần xem xét để hiểu rõ hiệu suất của thuật toán trong các tình huống khác nhau. Đây là các trường hợp cơ bản:

**Trường hợp Tốt Nhất (Best Case):** Trường hợp tốt nhất là tình huống mà thuật toán hoạt động nhanh nhất. Đây thường là tình huống lý tưởng hoặc đầu vào tốt nhất mà thuật toán có thể xử lý. Ví dụ, trong thuật toán tìm kiếm tuần tự, trường hợp tốt nhất xảy ra khi phần tử cần tìm nằm ở vị trí đầu tiên trong danh sách.

**Trường hợp Trung Bình (Average Case):** Trường hợp trung bình là tình huống mà thuật toán thường gặp trong thực tế, khi đầu vào là ngẫu nhiên hoặc có đặc điểm phân phối đồng đều. Để phân tích trường hợp trung bình, ta thường phải dựa vào các giả định về phân phối dữ liệu và tính toán độ phức tạp dựa trên các tình huống khác nhau.

**Trường hợp Xấu Nhất (Worst Case):** Trường hợp xấu nhất là tình huống mà thuật toán phải mất nhiều thời gian nhất để hoàn thành. Đây là trường hợp cần được xem xét để đảm bảo rằng thuật toán vẫn hoạt động hiệu quả ngay cả khi gặp các đầu vào bất lợi nhất. Ví dụ, trong thuật toán sắp xếp nổi bọt, trường hợp xấu nhất xảy ra khi danh sách đã được sắp xếp theo thứ tự ngược lại.

## Độ phức tạp không gian

**Độ Phức Tạp Không Gian:** Đo lường lượng bộ nhớ cần thiết để thực hiện thuật toán. Thường được biểu diễn tương tự như độ phức tạp thời gian, ví dụ như O(n), O(n^2), etc.