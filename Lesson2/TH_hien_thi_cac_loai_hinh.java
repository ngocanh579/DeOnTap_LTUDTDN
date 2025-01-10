import java.util.Scanner;

public class TH_hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luachon;
        do {
            System.out.println("1.Chọn hình chữ ngật: ");
            System.out.println("2.Chọn hình tam giác vuông: ");
            System.out.println("3.Chọn hình tam giác cân : ");
            System.out.println("4.Exit");
            System.out.print("Moi ban nhap lua chon: ");
            luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    System.out.print("nhap chieu dai: ");
                    int d = Integer.parseInt(sc.nextLine());
                    System.out.print("nhap chieu rong: ");
                    int r = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < d; j++) {
                            System.out.print("*");
                        }
                        System.out.println();// xuong dong sau moi hang
                    }
                    break;
                case 2:
                    System.out.println("submenu");
                    System.out.println("\t1. top-left");
                    System.out.println("\t2. top-right");
                    System.out.println("\t3. bottom-left");
                    System.out.println("\t4. bottom-right");
                    System.out.println("\t5: exit");
                    System.out.print("Moi ban nhap lua chon: ");
                    int luachon2 = Integer.parseInt(sc.nextLine());
                    switch (luachon2) {
                        case 1:
                            // TODO : in ra hinh tam giac goc tren ben trai
                            System.out.print("nhap chieu cao cua tam giac : ");
                            int h = Integer.parseInt(sc.nextLine());
                            for (int i = 1; i <= h; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 5:
                            // TODO : exit
                            System.exit(0);
                            break;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi ban nhap lai!!!!");
            }
        } while (luachon != 4);
    }
}
