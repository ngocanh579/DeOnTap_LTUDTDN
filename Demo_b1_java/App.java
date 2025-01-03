import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        static : phương thức tĩnh , không cần tạo đối tượng
//        System.out.println("Hello World");
////        lưu ý , tên class , biến, hàm , phương thức , tránh dùng = main
//        // biến : lưu trữ giá trị
//        int a = 5;
//        int b = 10;
//        int tong = a * b;
//        System.out.println(tong);
////        khai báo hằng dùng final
////         lưu ý so sánh 2 string
//        String name ="Nma";
//        String name2 = "Nma";
//
//        System.out.println(name.equals(name2));
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap x : ");
//        int x = sc.nextInt();
       String x = sc.nextLine();
        System.out.print("nhap y: ");
//        int y = sc.nextInt();
        String y= sc.nextLine();
//        System.out.println(x);
        int sum =Integer.parseInt(x) + Integer.parseInt(y);
        System.out.println("x" + "+"+ "y" + "=" +sum);
    }
}
