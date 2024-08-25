# Hàm (Function)

Hàm là một khối mã chỉ chạy khi được gọi.

Bạn có thể truyền dữ liệu, được gọi là tham số, vào một hàm.

Hàm được sử dụng để thực hiện một số hành động nhất định và chúng cũng được gọi là phương thức.

Tại sao sử dụng phương thức? Để tái sử dụng mã: định nghĩa mã một lần và sử dụng nhiều lần.

---

# Khai báo hàm

Một phương thức phải được khai báo trong một lớp (class). 

Nó được định nghĩa bằng tên của phương thức, theo sau là dấu ngoặc đơn (). 

Java cung cấp một số phương thức được xác định trước, chẳng hạn như *System.out.println()*, nhưng bạn cũng có thể tạo các phương thức của riêng mình để thực hiện các hành động nhất định:

``` Java
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```

Giải thích:

- myMethod() là tên của phương thức.

- static có nghĩa là phương thức thuộc về lớp Main chứ không phải là đối tượng của lớp Main. Bạn sẽ tìm hiểu thêm về các đối tượng và cách truy cập các phương thức thông qua các đối tượng sau.

- void có nghĩa là phương thức này không có giá trị trả về. Bạn sẽ tìm hiểu thêm về các giá trị trả về sau.

---

# Gọi một hàm

Để gọi một phương thức trong Java, hãy viết tên phương thức theo sau là hai dấu ngoặc đơn () và dấu chấm phẩy;

Trong ví dụ sau, myMethod() được sử dụng để in một văn bản (hành động), khi nó được gọi:

``` Java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "I just got executed!"
```

A method can also be called multiple times:

``` Java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}

// I just got executed!
// I just got executed!
// I just got executed!
```

---

# Tham số và đối số (Parameters and Arguments)

Thông tin có thể được truyền đến các phương thức dưới dạng tham số. Các tham số hoạt động như các biến bên trong phương thức.

Các tham số được chỉ định sau tên phương thức, bên trong dấu ngoặc đơn. Bạn có thể thêm bao nhiêu tham số tùy thích, chỉ cần phân tách chúng bằng dấu phẩy.

Ví dụ sau là một hàm có chức năng ghép tên và họ thành tên đầy đủ và in ra màn hình, nó lấy một Chuỗi có tên là fname làm tham số. Khi phương thức được gọi, chúng ta truyền một chuỗi (Đối số), được sử dụng bên trong phương thức để ghép với họ và in ra tên đầy đủ:

``` Java
public class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
  }
}
// Liam Refsnes
// Jenny Refsnes
// Anja Refsnes
```

Bạn có thể có nhiều tham số tùy thích:

``` Java
public class Main {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }
}

// Liam is 5
// Jenny is 8
// Anja is 31
```

*Lưu ý: Khi làm việc với nhiều tham số, lệnh gọi phương thức phải có cùng số lượng đối số với số tham số và được truyền theo đúng thứ tự của tham số.*

---

# Giá trị trả về

Ở các nội dung trên, chúng ta đã sử dụng từ khóa void trong tất cả các ví dụ, điều này cho biết phương thức không trả về giá trị.

Nếu bạn muốn phương thức trả về giá trị, bạn có thể sử dụng kiểu dữ liệu nguyên thủy (như int, char, v.v.) thay vì void và sử dụng từ khóa return bên trong phương thức.

Ví dụ này trả về tổng của hai tham số của phương thức:

``` Java
public class Main {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(5, 3));
  }
}
// Outputs 8 (5 + 3)
```

You can also store the result in a variable (recommended, as it is easier to read and maintain):

``` Java
public class Main {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    int z = myMethod(5, 3);
    System.out.println(z);
  }
}
// Outputs 8 (5 + 3)
```

---

# Phạm vi biến

Trong Java, các biến chỉ có thể truy cập được bên trong vùng (Khối mã) chúng được tạo ra. Đây được gọi là phạm vi (Scope).

Một khối mã đề cập đến tất cả các mã giữa các dấu ngoặc nhọn {}.

Các biến được khai báo bên trong các khối mã chỉ có thể truy cập được bằng mã cùng trong một khối mã, theo sau dòng mà biến được khai báo:

``` Java
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

  // Code here CANNOT use x

  }
}
```

---