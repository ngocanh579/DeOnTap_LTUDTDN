import java.text.ListFormat.Style;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){

            System.out.println(i);
        }
        // while -> khong biet truoc so lan lap
        // vi du in ra cac so chan den khi so luong so chan in ra  = 20
        // in ra 20 so chan dau tien
        Scanner sc = new Scanner(System.in);
        int choice ;
        // vonf lap luon dung while(true)
        while (true) {
            System.out.println("1.");
            System.out.println("2. ");
            System.out.println("0. exit");
            int n = Integer.parseInt(sc.nextLine());
            if(n == 0){
                break;
            }
        }
        int x =0;
        int sum = 0;
        // do - while -> bat buoc phai thuc hien it nhat 1 lan sau do moi lap lai cong viec do
        do {
            System.out.println("nhap x: ");
             x = Integer.parseInt(sc.nextLine());
             sum += x;
        } while (x<10);
        System.out.println(sum);
    }
}
