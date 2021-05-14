import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        demoFor();
        System.out.println();
        deSoNguyenFor();
        System.out.println();
        deSoNguyenWhile();
        System.out.println();
        demSoNguyenWhile1();
        System.out.println();
        demSoDOWhile();
        System.out.println();
        demSoDoWhile1();
    }

    static void demoFor() {
        SoNguyTo sn = new SoNguyTo();
        System.out.println("Nhập vào số n:");
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();

        System.out.println("In ra Các số nguyên tố đầu tiên dùng for: ");
        for (int i = 2; i <= n; i++) {
            if (sn.inSoNguye(i)) {
                System.out.print(i + "\t");
            }
        }

    }

    static void deSoNguyenFor() {
        SoNguyTo sn1 = new SoNguyTo();
        System.out.println("In ra các số nguyên tố nhỏ hơn 100 dùng hàm for:");
        for (int i = 0; i <= 100; i++) {
            if (sn1.inSoNguye(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    static void deSoNguyenWhile() {
        SoNguyTo sn2 = new SoNguyTo();
        System.out.println("Nhập vào số n: ");
        Scanner sn1= new Scanner(System.in);
        int n= sn1.nextInt();
        System.out.println("In ra các số nguyên tố đầu tiên dùng hàm while:");
        int i = 0;
        while (i<=n) {
            if (sn2.inSoNguye(i)) {
                System.out.print(i + "\t");
            }
            i++;
        }
    }

    static void demSoNguyenWhile1() {
        SoNguyTo sn3 = new SoNguyTo();
        System.out.println("In ra các số nguyên tố nhỏ hơn 100 dùng hàm while:");
        int i = 0;
        while (i < 100) {
            if (sn3.inSoNguye(i)) {
                System.out.print(i + "\t");
            }
            i++;
        }
    }

    static void demSoDOWhile() {
        SoNguyTo sn4 = new SoNguyTo();
        System.out.println("Nhập vào số n: ");
        Scanner scanner1= new Scanner(System.in);
        int n =scanner1.nextInt();
        System.out.println("In ra các số nguyên tố đầu tiên dùng hàm do while:");
        int i = 0;
        do {
            if (sn4.inSoNguye(i)) {
                System.out.print(i + "\t");
            }
            i++;
        } while (i <= n);
    }

    static void demSoDoWhile1() {
        SoNguyTo sn5 = new SoNguyTo();
        System.out.println("In ra các số nguyên tố nhỏ hơn 100 dùng hàm do while:");
        int i = 0;
        do {
            if (sn5.inSoNguye(i)) {
                System.out.print(i + "\t");
            }
            i++;
        } while (i <= 100);
    }

}
