import java.util.Scanner;

public class TH_ung_dung_tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong tien vay: ");
        int tien = sc.nextInt();
        System.out.print("nhap ty le lai suat theo thang: ");
        double tyLe = sc.nextDouble();
        System.out.print("nhap so thang vay: ");
        int thang = sc.nextInt();
        double tienLai = 0;
        // for (int i = 1; i <= thang; i++) {
        // tienLai += tien * ((tyLe / 100) / 12) * thang;
        // }
        int i = 1;
        while (i <= thang) {
            tienLai += tien * ((tyLe / 100) / 12) * thang;
            i++;
        }
        double tongtien = tien + tienLai;
        System.out.printf("Số tiền lãi là: %.2f VND\n", tienLai);
        System.out.printf("Tổng số tiền phải trả sau %d tháng là: %.2f VND\n", thang, tongtien);
    }

}
