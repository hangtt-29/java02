import java.util.Scanner;

public class DemChuoi {


    static void inDexChuoi() {
        String str = "You only live once, but if you do it right, once is enough";
        System.out.println("In ra index của tất cả ký tự  o trong chuỗi trên: ");
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toString(str.charAt(i)).equals("o")) {
                System.out.print(i + "\t");
                dem++;
            }
        }
        System.out.println("\nTổng số lần xuất hiện trong chuỗi:" + dem);
    }

    static void demChuoi() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi:");
        String ip = s.nextLine();
        ip = ip.trim();
        ip=ip.replaceAll("\\s+"," ");
        int dem = 0;
        for (int i = 0; i < ip.length(); i++) {
            if (Character.toString(ip.charAt(i)).equals(" ")) {
                dem++;
            }
        }
        dem = dem + 1;
        System.out.println("In tổng số từ của chuỗi " + dem);
    }

}
