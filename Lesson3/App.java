import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Khởi tạo mảng
        int[] arr = new int[5];

        // Thêm giá trị vào mảng
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;

        // In các phần tử của mảng
        for (int j : arr) {
            System.out.println(j);
        }

        // Nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter b number: ");
        int b = sc.nextInt();

        // Tính tổng hai số đã nhập
        System.out.println("The sum of a and b: " + sum(a, b));

        // Tính tổng các phần tử trong mảng
        System.out.println("The sum of the array elements: " + sum(arr));
    }

    // Hàm tính tổng của 2 số
    public static int sum(int a, int b) {
        return a + b;
    }

    // Hàm tính tổng các phần tử trong mảng
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Cộng dồn giá trị của mỗi phần tử trong mảng
        }
        return sum;
    }
    public static void show(String ms){
        System.out.println(ms);
        // hàm không có giá trị trả về
    }
}
